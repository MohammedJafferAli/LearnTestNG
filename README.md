# TestNG Framework Learning and Usage Guide

Welcome to the **TestNG Framework Learning and Usage Guide** repository! This guide provides a comprehensive, step-by-step approach to learning and using the TestNG framework for Java-based testing. Whether you're new to TestNG or looking to enhance your testing skills, this repository will help you get started and make the most of TestNG.

## Table of Contents

- [Introduction](#introduction)
- [Prerequisites](#prerequisites)
- [Setup and Installation](#setup-and-installation)
    - [Using Maven](#using-maven)
- [Basic Concepts](#basic-concepts)
    - [TestNG Annotations](#testng-annotations)
    - [TestNG XML Configuration](#testng-xml-configuration)
- [Writing Tests](#writing-tests)
- [Running Tests](#running-tests)
    - [From IDE](#from-ide)
    - [From Command Line](#from-command-line)
- [Advanced Features](#advanced-features)
- [Troubleshooting](#troubleshooting)
- [Additional Resources](#additional-resources)
- [Important Notes](#important-notes)

## Introduction

TestNG is a powerful testing framework inspired by JUnit and NUnit, designed to cover a wide range of test categories including unit, functional, end-to-end, and integration testing. TestNG provides extensive functionality for configuring and running tests, and generates detailed reports.

## Prerequisites

Before you start, ensure you have the following:

- **Java Development Kit (JDK)**: TestNG requires JDK 8 or higher.
- **IDE**: An Integrated Development Environment such as IntelliJ IDEA or Eclipse.
- **Maven or Gradle**: For dependency management (optional but recommended).

## Setup and Installation

### Using Maven

1. **Create a Maven Project**:
   Create a new Maven project in your IDE.

2. **Add TestNG Dependency**:
   Add the TestNG dependency to your `pom.xml` file:

   ```xml
   <dependencies>
       <dependency>
           <groupId>org.testng</groupId>
           <artifactId>testng</artifactId>
           <version>7.7.0</version>
           <scope>test</scope>
       </dependency>
   </dependencies>

## Basic Concept

TestNG Annotations
TestNG uses annotations to define test methods and configure the test execution process. Key annotations include:

@Test: Marks a method as a test method. Start your execution without java compiler.
A Class can contain more than one Test method.


## Create testng.xml file for execution

To create a testng.xml from the first time content click on the project -> select create TestNG XML.
#### Configure testng.xml to control the whole project execution


```testng.xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="Banking Application Suite">
    <test verbose="2" preserve-order="true" name="Loan Department">
       <classes>
            <class name="packagename.classname">
                <methods>
                        <include name="carLoanLogin"/>
                        <exclude name="homeLoanLogout"/>
                </methods>
            </class>
       </classes>
        <packages>
            <package name="packagename">
            </package>
        </packages>
    </test>
</suite>

```
### TestNG Annotations

TestNG Annotation is a piece of code which is inserted inside a program or business logic used to control the flow of execution of test methods.

The Order of execution. The same is maintained in the testng.xml file too.
1. @BeforeSuite
2. @BeforeTest
3. @BeforeClass
4. @BeforeMethod 
5. @Test 
6. @AfterMethod 
7. @AfterClass 
8. @AfterTest 
9. @AfterSuite

#### TestNG Annotation Attributes 

There are many annotation attributes are available in testng and few of them can be used only with particular annotation.
To know more about this, check this site and get the compatible one : [TestNG Annotation Attributes](https://testng.org/annotations.html)

*commonly used test annotation attributes*

1. enabled
2. groups
3. dependsOnMethods
4. dependsOnGroups
5. priority
6. timeOut
7. description
8. **dataProvider**
9. **dataProviderClass**

### Parameterization
Parameterization is used to pass the value to the test either from the testng.xml file config or using separate data provide methods.
@Parameters annotation can be used at the test method level and the value passed from xml file
@Test(dataProvider={dataprovider-method-name})

Check banking day 3 classes and the testng_day3.xml

### TestNG Listeners

Listener is defined as interface that modifies the default TestNG’s behavior. As the name suggests Listeners “listen” to the event defined in the selenium script and behave accordingly. It is used in selenium by implementing Listeners Interface. It allows customizing TestNG reports or logs.

Mostly commonly used TestNG listener interface is "ITestListener".

1. onStart
2. onTestStart 
3. onTestSuccess 
4. onTestFailure 
5. onTestSkipped 
6. onTestFailed But Within Success Percentage 
7. onTestFailedWithTimeout 
8. onFinish

[Learn more about TestNG Listeners](https://www.guru99.com/listeners-selenium-webdriver.html)

### Parallel Test using TestNG

To trigger test in parallel to reduce the execution time. by default execution will happen in sequence. 

To run the tests in parallel there are different ways, and the most commonly used methods are
1. Define at the suite level so the test will execute in parallel

*how?*
```dtd
<suite name="Parameterization suite" parallel="tests" thread-count="2">
```
2. Define at the test level so classes will execute in parallel
*how?*
```dtd
<test name="Banking Test" parallel="classes" thread-count="3"/>
```

I will be adding more topics related to testng in the future. Stay connected!

#### **Important notes**
1. Whenever there are any change in the maven project, then build the project first before taking any other action.
2. The order execution in testng.xml and the annotations are same and execute them in the same sequence.
