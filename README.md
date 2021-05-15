# SpringCloudConfig

## Description
The **SpringCloudConfig** is a project that show how to implement a configuration server using the Spring Cloud Config Server.

## Technologies
The project use the following technologies:

* Java 11
* Apache Maven
* Project aggregation
* Spring Boot
* Spring Cloud Config Server
* IDE Eclipse

## Git repository
The Spring Cloud Config Server store the configurations in a remote or local Git repository. This project use a local Git repository. 

**Step 1:** Create a folder for local Git repository

```
mkdir -p /opt/springcloudconfig/git
```

**Step 2:** Create a file named *application.properties* and add some configuration for test.

```
configuration.one=Configuration number one
```

**Step 3:** Initialize the Git repository

```
cd /opt/springcloudconfig/git
git init .
git config user.email "ctseducare@ctseducare.com"
git config user.name "CTSEducare"
git add .
git commit -m "Setting the local repository"

```

## Testing the project
**Step 1:** Start the microservices
* ConfigServer
* ServiceOne

**Step 2:** To see value of configuration access the link:

```
http://localhost:8890/serviceone
```

## Release History
* 1.0.0 (2021-05-15)
    * First version
