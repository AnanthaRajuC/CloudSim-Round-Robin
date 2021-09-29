## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. 

### Prerequisites

*	Add the **[cloudsim-3.0.3](https://github.com/Cloudslab/cloudsim/releases/tag/cloudsim-3.0.3)** JAR file present in the **lib** folder to the project build path

## Installing

#### Running the application with IDE

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `cloudsim_round_robin` class from your IDE.

* 	Download the zip or clone the Git repository.
* 	Unzip the zip file (if you downloaded one)
* 	Open Command Prompt and Change directory (cd) to folder containing pom.xml
* 	Open Eclipse
	* File -> Import -> Existing Maven Project -> Navigate to the folder where you unzipped the zip
	* Select the project
* 	Choose the Spring Boot Application file (search for @SpringBootApplication)
* 	Right Click on the file and Run as Java Application

#### Running the application with Maven

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
$ git clone https://github.com/AnanthaRajuCprojects/CloudSim-Round-Robin.git
$ cd CloudSim-Round-Robin
$ mvn spring-boot:run
```

#### Running the application with Executable JAR

The code can also be built into a jar and then executed/run. Once the jar is built, run the jar by double clicking on it or by using the command 

```shell
$ git clone https://github.com/AnanthaRajuCprojects/CloudSim-Round-Robin.git
$ cd CloudSim-Round-Robin
$ mvn package -DskipTests
$ java -jar target/CloudSim-Round-Robin-0.0.1-SNAPSHOT.jar
```

To shutdown the jar, follow the below mentioned steps on a Windows machine.

*	In command prompt execute the **jcmd** command to print a list of all running Java processes
*	**Taskkill /PID PROCESS_ID_OF_RUNNING_APP /F** execute this command by replacing the **PROCESS_ID_OF_RUNNING_APP** with the actual process id of the running jar found out from executing the previous command
