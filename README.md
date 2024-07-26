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



#### **Important notes**
1. Whenever there are any change in the maven project, then build the project first before taking any other action.