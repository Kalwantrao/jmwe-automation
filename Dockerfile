# Use the official OpenJDK 11 base image
FROM openjdk:11

# Set environment variables for Java and Gradle
ENV JAVA_HOME=/usr/local/openjdk-11
ENV PATH=$PATH:$JAVA_HOME/bin
ENV GRADLE_HOME=/opt/gradle
ENV PATH=$PATH:$GRADLE_HOME/bin

# Install dependencies
RUN apt-get update && \
    apt-get install -y wget unzip git

# Install Gradle using the official Gradle Docker image
RUN wget -O /tmp/gradle.zip https://services.gradle.org/distributions/gradle-7.3-bin.zip && \
    unzip -d /opt /tmp/gradle.zip && \
    rm -f /tmp/gradle.zip && \
    ln -s /opt/gradle-7.3 /opt/gradle

# Set environment variable for ACLI_HOME
ENV ACLI_HOME=/opt/acli

# Create ACLI directory
RUN mkdir -p $ACLI_HOME

# Add properties to acli.properties
RUN echo "your_property_key=your_property_value" >> $ACLI_HOME/acli.properties

# Set working directory
WORKDIR /app

# Clone the code from Git and switch to the "cloud" branch
RUN git clone https://github.com/Kalwantrao/jmwe-automation.git . && \
    git checkout cloud

# RUN /opt/gradle/bin/gradle itestCloud

# Your additional instructions, if any

# Specify the command to run your application
#CMD [ "java", "-jar", "your-application.jar" ]