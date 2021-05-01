# CloudSim-Round-Robin
[![FOSSA Status](https://app.fossa.com/api/projects/git%2Bgithub.com%2FAnanthaRajuCprojects%2FCloudSim-Round-Robin.svg?type=shield)](https://app.fossa.com/projects/git%2Bgithub.com%2FAnanthaRajuCprojects%2FCloudSim-Round-Robin?ref=badge_shield)

CloudSim Example with Round Robin Data center broker &amp; Round Robin Vm Allocation Policy with Circular Hosts List.

<a href='https://coveralls.io/r/AnanthaRajuC/CloudSim-Round-Robin'><img src='https://coveralls.io/repos/AnanthaRajuC/CloudSim-Round-Robin/badge.svg' alt='Coverage Status' /></a>

I found this program in a repo created by the github user "alessandroleite". All the necessary files were scattered across in various locations. I forked them all and created one single file with all the necessary program files and the jar files with an intention of simplifying the way you fork the files and run the code on your local machine.

## Technology stack & other Open-source libraries

### Server - Backend

* 	[JDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) - Java™ Platform, Standard Edition Development Kit
* 	[Spring Boot](https://spring.io/projects/spring-boot) - Framework to ease the bootstrapping and development of new Spring Applications
* 	[Maven](https://maven.apache.org/) - Dependency Management

###  Libraries and Plugins

* 	[cloudsim](http://www.cloudbus.org/cloudsim/) - A Framework For Modeling And Simulation Of Cloud Computing Infrastructures And Services.

### Others 

* 	[git](https://git-scm.com/) - Free and Open-Source distributed version control system

### External Tools & Services

* 	[gitignore.io](https://www.toptal.com/developers/gitignore/api/java,eclipse,intellij) - Create useful .gitignore files for your project.
*	[FOSSA](https://fossa.com/) - Scalable, end-to-end management for third-party code, license compliance and vulnerabilities.
*	[Dependabot](https://dependabot.com/) - Automated dependency updates.

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

## Reporting Issues/Suggest Improvements

This Project uses GitHub's integrated issue tracking system to record bugs and feature requests. If you want to raise an issue, please follow the recommendations below:

* 	Before you log a bug, please [search the issue tracker](https://github.com/AnanthaRajuCprojects/CloudSim-Round-Robin/search?type=Issues) to see if someone has already reported the problem.
* 	If the issue doesn't already exist, [create a new issue](https://github.com/AnanthaRajuCprojects/CloudSim-Round-Robin/issues/new)
* 	Please provide as much information as possible with the issue report.
* 	If you need to paste code, or include a stack trace use Markdown +++```+++ escapes before and after your text.

## The End

In the end, I hope you enjoyed the application and find it useful, as I did when I was developing it.

If you would like to enhance, please: 

* 	**Open PRs**, 
* 	Give **feedback**, 
* 	Add **new suggestions**, and
*	Finally, give it a 🌟.

*	Happy Coding ...* 🙂

## FOSSA third-party code, license compliance and vulnerabilities

## License

[![FOSSA Status](https://app.fossa.com/api/projects/git%2Bgithub.com%2FAnanthaRajuCprojects%2FCloudSim-Round-Robin.svg?type=large)](https://app.fossa.com/projects/git%2Bgithub.com%2FAnanthaRajuCprojects%2FCloudSim-Round-Robin?ref=badge_large)
