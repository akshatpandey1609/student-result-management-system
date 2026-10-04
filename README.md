# Student Result Management System

A beginner-friendly **Core Java** console application that accepts student details and marks, calculates the total and average, assigns a grade, and determines the pass/fail result.

## Features

- Accepts student name, roll number and age
- Accepts marks for five subjects
- Calculates total marks
- Calculates average marks
- Determines PASS/FAIL based on subject-wise passing marks
- Assigns a grade based on average marks
- Uses a layered package structure with an entity, service interface, service implementation, business object, and display class

## Project Structure

```text
Student-Result-Management-System/
├── src/
│   └── com/bytecode/main/
│       ├── MainApp.java
│       ├── bo/
│       │   └── StudentBO.java
│       ├── db/
│       │   └── DB.java
│       ├── entity/
│       │   └── Student.java
│       └── service/
│           ├── StudentService.java
│           └── impl/
│               └── StudentServiceImpl.java
├── compile.bat
├── run.bat
├── .gitignore
└── README.md
```

## Requirements

- Java JDK 8 or later
- Windows (for the included `.bat` scripts)

## How to Run

### Option 1: Windows batch file

Double-click `run.bat`.

### Option 2: Command line

From the project root:

```bash
javac -d bin src/com/bytecode/main/MainApp.java src/com/bytecode/main/bo/StudentBO.java src/com/bytecode/main/db/DB.java src/com/bytecode/main/entity/Student.java src/com/bytecode/main/service/StudentService.java src/com/bytecode/main/service/impl/StudentServiceImpl.java
```

Then run:

```bash
java -cp bin com.bytecode.main.MainApp
```

## Grading Logic

A student passes only when every subject has at least **33 marks**.

| Average | Grade |
|---:|:---|
| 90+ | A+ |
| 80–89.99 | A |
| 70–79.99 | B |
| 60–69.99 | C |
| 50–59.99 | D |
| Below 50 (if all subjects are passed) | E |
| Any subject below 33 | F / FAIL |

## Learning Concepts

This project was created to practice Core Java concepts such as:

- Classes and Objects
- Encapsulation
- Constructors
- Getters and Setters
- Interfaces
- Interface implementation
- Packages
- Method overriding
- Basic business logic
- Console input using `Scanner`

## Project Status

**Version 1.0 — Initial Core Java project**

This version intentionally keeps the original functionality simple. Future versions can introduce features such as multiple students, CRUD operations, validation, file handling, and database connectivity.
