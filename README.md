# Using Log4J with SLF4J
Introduction on using Log4J and SL4J in Java 8

**Table of Contents**
<!-- TOC depthFrom:2 depthTo:6 withLinks:1 updateOnSave:1 orderedList:0 -->

- [1 Requirements](#1-requirements)
- [2 What is logging?](#2-what-is-logging)

<!-- /TOC -->

## 1 Requirements

Download the following libraries, unzip it and include the following jar files in your project.

1. [Log4J](https://logging.apache.org/log4j/2.x/download.html)
  1. log4j-api-2.5.jar
  2. log4j-core-2.5.jar
  3. log4j-slf4j-impl-2.5.jar
2. [SLF4J](http://www.slf4j.org/download.html)
  1. slf4j-api-1.7.21.jar

## 2 What is logging?

In general Logging refers to recording of activity. In Java, logging can be divided into three levels:

```
            Logging
               |
  .------------+-------------.
  |            |             |
Logger      Formatter      Handler
                          (Appender)
```

**Logger**

Loggers is an object, which is called when you want to log a message. Logger has two main objects in it:

* Name
* Logging levels

*Name*: It is the class name of the application. For example `com.gollahalli.UsingLog4JSL4J`. You can use this by calling

```java
logger.getName();
```

*Levels*: They are the logging events that can be called while running a program.

Log4J and SLF4J provides the following levels of events:

|   Log4J  | SLF4J |
|:--------:|:-----:|
| ALL      | -     |
| DEBUG    | DEBUG |
| ERROR    | ERROR |
| FATAL    | -     |
| INFO     | INFO  |
| OFF      | -     |
| TRACE    | TRACE |
| WARN     | WARN  |
| CATCHING | -     |

**Formatter**

See the highlighted line in [log4j-configFile.xml](https://github.com/akshaybabloo/Using-Log4J-SLF4J/blob/master/src/com/gollahalli/log4j-configFile.xml#L13)

These are used to format the way the logs are displayed on the Terminal/Command Prompt or in the log files.

**Handler (Appender)**
