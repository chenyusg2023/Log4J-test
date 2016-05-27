# Using Log4J with SLF4J
Introduction on using Log4J with SLF4J in Java 8

**Table of Contents**

<!-- TOC depthFrom:1 depthTo:6 withLinks:1 updateOnSave:1 orderedList:0 -->

- [Using Log4J with SLF4J](#using-log4j-with-slf4j)
	- [1 Requirements](#1-requirements)
	- [2 What is logging?](#2-what-is-logging)
		- [3.1 Logger](#31-logger)
		- [3.2 Formatter](#32-formatter)
		- [3.3 Appender](#33-appender)
	- [4 What is Log4J?](#4-what-is-log4j)
		- [4.1 Why use Log4J when Java has java.util.logging?](#41-why-use-log4j-when-java-has-javautillogging)
	- [5 What is SLF4J?](#5-what-is-slf4j)
		- [5.1 Why use SLF4J when Log4J has more API's to use?](#51-why-use-slf4j-when-log4j-has-more-apis-to-use)
	- [6 All about `log4j-configFile.xml`](#6-all-about-log4j-configfilexml)

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

### 3.1 Logger

Loggers is an object, which is called when you want to log a message. Logger has two main objects in it:

* Name
* Logging levels

**Name**

It is the class name of the application. For example `com.gollahalli.UsingLog4JSLF4J`. You can use this by calling

```java
logger.getName();
```

**Levels**

They are the logging events that can be called while running a program.

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

### 3.2 Formatter

See the highlighted line in [log4j-configFile.xml#L13](https://github.com/akshaybabloo/Using-Log4J-SLF4J/blob/master/src/com/gollahalli/log4j-configFile.xml#L13) for system output and  [log4j-configFile.xml#L6](https://github.com/akshaybabloo/Using-Log4J-SLF4J/blob/master/src/com/gollahalli/log4j-configFile.xml#L6) for log file storage.

These are used to format the way the logs are displayed on the Terminal/Command Prompt or in the log files.

### 3.3 Appender

See the highlighted lines in [log4j-configFile.xml#L3-L18](https://github.com/akshaybabloo/Using-Log4J-SLF4J/blob/master/src/com/gollahalli/log4j-configFile.xml#L3-L18)

They are used to write the log events to a given file or a destination (system out).

Log4J supports different types of appenders (see [Appenders](https://logging.apache.org/log4j/2.x/manual/appenders.html)), but in this tutorial we will see two most commonly used appenders

* Async
* Console
* File

**Async Appender**

See the highlighted lines in  [log4j-configFile.xml#L15-L17](https://github.com/akshaybabloo/Using-Log4J-SLF4J/blob/master/src/com/gollahalli/log4j-configFile.xml#L15-L17)

If you are trying to reference other appenders, for example `File` appender, Async can be used. The important aspect of `Async` appender is that, whenever a log event is generated it is always written on a different thread.

**Console Appender**

See the highlighted lines in [log4j-configFile.xml#L12-L14](https://github.com/akshaybabloo/Using-Log4J-SLF4J/blob/master/src/com/gollahalli/log4j-configFile.xml#L12-L14)

This type of error writes the log event to the console using either of the two output types

```Java
System.out
System.err
```

But it's default target is `System.err`

**File Appender**

See the highlighted lines in [log4j-configFile.xml#L4-L10](https://github.com/akshaybabloo/Using-Log4J-SLF4J/blob/master/src/com/gollahalli/log4j-configFile.xml#L4-L10)

As the name suggests, `File` appender can be used to append a log event to the given file name.

## 4 What is Log4J?

Log4J is a logging library for Java developed by Apache Logging project, which is a part of Apache Software Foundation Project.

### 4.1 Why use Log4J when Java has java.util.logging?

Apache can do everything java.util.logging can but more. Log4J can be used to log at the runtime. It also helps in lowering the performance cost. For more information see [Apache Logging](https://logging.apache.org/).

## 5 What is SLF4J?

Simple Logging Facade for Java (SLF4J) acts like an abstract layer for different types of logging libraries. This include Log4J.

### 5.1 Why use SLF4J when Log4J has more API's to use?

Thats correct, but what if you don't want to use Log4J? and the person yoy give it to has Logback with them. That's SLF4J comes in handy. For more information see [SLF4J](http://www.slf4j.org/).

## 6 All about `log4j-configFile.xml`

There are two ways to configure Log4J. One by using `XML` and the other is to use `JSON`. For the purpose of this tutorial we will stick to `XML`.

**Overview of Configuration File**

See [log4j-configFile.xml](https://github.com/akshaybabloo/Using-Log4J-SLF4J/blob/master/src/com/gollahalli/log4j-configFile.xml)

```xml
<?xml version="1.0" encoding="UTF-8"?>
<Configuration ...>
    <Appenders>
        <!-- This is where your appenders go -->
    </Appenders>
    <Loggers>
        <Root ...>
          <!-- Refer to an appender from here -->
        </Root>
    </Loggers>
</Configuration>
```

For more information see [Log4J Configuration](https://logging.apache.org/log4j/2.x/manual/configuration.html).
