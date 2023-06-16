
# jmwe-automation-tests-gint

To run this integration test framework, we need some prerequisites

- java jdk_17 or higher

- ACLI client

- Jira command line interface in jira instance with valid license key

- Jira server and cloud access

- Jira configured with acli

- Gradle installed (not mandatory but recommended -otherwise run with gradle-wrapper)

## Environment Variables

To run this project, you will need to set the following environment variables

- `JAVA_HOME`

- `ACLI_HOME`

- `GRADLE_HOME`

## Pre-requisites in Jira Instance:

As ACLI does not provides support for some Jira features so we need to configure them manually in our instance.

- Project Key lenght Setting: Set `Project Key length` to 40 characters (In Jira instance,go to `system → Edit Settings → Maximum project key size = 40`).

- Add user `jmwe_qa` in your instance with username `jmwe_qa` and password `jmwe-qa`

## acli.properties file should be in ACLI directory or gradle local directory,
- for server and cloud instance it should be similar to
```
jiraServer = --server http://localhost:9090/ --user yourUsername --password yourPassword`
jiraCloud = --server https://automationgint.atlassian.net/ --user yourUsername --token APItoken
```
- Add this property for user in acli.properties file
```
jmwe_qa = --server http://localhost:9090/ --user jmwe_qa --password jmwe_qa
```

## Steps to run Integration test framework:

- Clone the project  from bitbucket- [jmwe-automation-tests-gint](https://bitbucket.org/appfire/jmwe-automation-tests-gint/src/master/) repository.


- Open the command prompt in project’s root directory.


- Update the gradle.properties file as per your setting values provided in acli.properties file for jira instance.


- Use command to run the scripts of jmwe-extensions using gradle: `./gradlew conditions validators postfunctions`
- Use command to run the single extension using gradle:
   `./gradlew conditions-currentStatusCondition` ,
   `./gradlew conditions-commentRequiredValidator` ,
   `./gradlew conditions-addFieldValueToParentIssuePostfunction`

## Gint framework documentation
Check the documentation for getting started with gint-acli

- [Gint-documentation](https://ginthome.atlassian.net/wiki/spaces/GINT/overview?mode=global)

- [bitbucket code repo gint-examples-bobswift](https://bitbucket.org/bobswift/gint-examples/src/master/)

- [bitbucket code repo jmwe-automation-tests-gint](https://bitbucket.org/appfire/jmwe-automation-tests-gint/src/master/)


## Help

Ask help at slack channel

- `#help-gint`

- `#help-acli`


