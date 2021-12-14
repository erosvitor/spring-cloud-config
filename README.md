## About
The project shows how to implement a configuration server using the Spring Cloud Config Server.

## Technologies
The following technologies were used in this project:

* [Java Oracle](https://www.oracle.com/java/)
* [Apache Maven](https://maven.apache.org/)
* [Spring Boot](https://spring.io/projects/spring-boot)
* [Spring Cloud Config](https://spring.io/projects/spring-cloud-config)
* [IDE Eclipse](https://www.eclipse.org/)

## Starting the project

### Clonning the project
```
$ git clone https://github.com/erosvitor/spring-cloud-config.git

$ cd spring-cloud-config
```

### Creating Git repository
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

### Testing the project
**Step 1:** Start the microservices using Eclipse IDE or by Maven command line
* ConfigServer
* ServiceOne

**Step 2:** To see value of configuration access the link:

```
http://localhost:8890/serviceone
```

## License
This project is under license from MIT. For more details, see the LICENSE file.
