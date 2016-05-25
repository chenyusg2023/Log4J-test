# Using Log4J with SLF4J
Introduction on using Log4J and SL4J in Java 8

**Table of Contents**
<!-- TOC depthFrom:2 depthTo:6 withLinks:1 updateOnSave:1 orderedList:0 -->

- [1 What is logging?](#1-what-is-logging)

<!-- /TOC -->

## 1 What is logging?

In general Logging refers to recording of activity. Logging can be divided into three levels:

```
            Logging
               |
  ----------------------------
  |            |             |
Logger      Formatter      Handler
                          (Appender)
```
