
# jmwe-automation-tests-gint

To run this integration test framework, we need some prerequisites

- java jdk_11 or higher

- ACLI client application

- Gradle installed (not mandatory but recommended -otherwise run with gradle-wrapper)

## Environment Variables

To run this project, you will need to set the following environment variables

- `JAVA_HOME`

- `ACLI_HOME`

- `GRADLE_HOME`

## Pre-requisites in Jira Instance:

#### Create screen with name "AUTOMATION" in Jira and add the following fields:
   - Assignee
   - Affects Version/s
   - Fix Version/s
   - Labels
   - Component/s
   - Priority
   - Story Points
   - Original Story Points
   - Environment
   - Summary
   - Reporter
   - Security Level
   - Linked Issues


#### Create new user with credentials as mentioned:
  - Username `jmwe_qa`
  - Password `jmwe_qa`
  - Email address `jmwe_qa@gmail.com`

## Install Jira command line interface in jira instance with valid license key
- Install the `Jira Command Line Interface(CLI)` application from atlassian marketplace in your Jira instance.
- Update with valid `License key` for getting started with Jira Command Line 

## Set acli.properties file should be in ACLI or gradle installation directory,
- For server and cloud instance it should be similar to

- `jiraServer = --server http://localhost:9090/ --user yourUsername --password yourPassword`

- `jiraCloud = --server https://automationgint.atlassian.net/ --user yourUsername --token APItoken`

- Update the above properties with Jira credentials.

- Only update the url with your Jira instance and add `jmwe_qa = --server http://localhost:9090/ --user jmwe_qa --password jmwe_qa` this property to acli.properties file.
- To verify the installation and configuration of ACLI, run the following command in the command line terminal: 
- `acli jiraServer --action getServerInfo`

## Steps to run Integration test framework:

- Clone the project  from bitbucket- [jmwe-automation-tests-gint](https://bitbucket.org/appfire/jmwe-automation-tests-gint/src/master/) repository.

- Update the gradle.properties file as per your setting values provided in acli.properties file for jira instance.
  `jira`= `jiraServer`
  `systemProp.cli`=`acli jiraServer`

- Open the command prompt in project’s root directory.
- Use command to run the scripts of jmwe-extensions using gradle: `./gradlew conditions validators postfunctions`
- Use command to run the single extension using gradle:
   `./gradlew conditions-currentStatusCondition` ,
   `./gradlew validators-commentRequiredValidator` ,
   `./gradlew postfunctions-addFieldValueToParentIssuePostfunction`

## Gint framework documentation
Check the documentation for getting started with gint-acli

- [Gint-documentation](https://ginthome.atlassian.net/wiki/spaces/GINT/overview?mode=global)

- [bitbucket code repo gint-examples-bobswift](https://bitbucket.org/bobswift/gint-examples/src/master/)

- [bitbucket code repo jmwe-automation-tests-gint](https://bitbucket.org/appfire/jmwe-automation-tests-gint/src/master/)


## Help

Ask help at slack channel

- `#help-gint`

- `#help-acli`


