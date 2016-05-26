# Using Log4J with SLF4J
Introduction on using Log4J and SL4J in Java 8

**Table of Contents**
<!-- TOC depthFrom:2 depthTo:6 withLinks:1 updateOnSave:1 orderedList:0 -->

- [1 What is logging?](#1-what-is-logging)

<!-- /TOC -->

## 1 What is logging?

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

*Name*: It is the class name of the application. For example `com.gollahalli`. You can use this by calling

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

See [log4j-configFile.xml](https://github.com/akshaybabloo/Using-Log4J-SLF4J/blob/master/src/com/gollahalli/log4j-configFile.xml)

These are used to format the way the logs are displayed on the Terminal/Command Prompt or in the log files.
