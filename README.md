# SpringCloudConfig

## Description
Project that show how to implement a configuration server using the Spring Cloud Config Server.

## Technologies
The project use the following technologies:

* Java 11
* Apache Maven
* Project aggregation
* Spring Boot
* Spring Cloud Config
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

## References
[Spring Boot](https://spring.io/projects/spring-boot)  
[Spring Cloud](https://spring.io/projects/spring-cloud)  
[Spring Cloud Config](https://spring.io/projects/spring-cloud-config)

## Release History
* 1.0.1 (2021-08-03)
    * Spring Boot updated to 2.5.3
    * Spring Cloud updated to 2020.0.3
    * Section 'references' added
* 1.0.0 (2021-05-15)
    * First version
