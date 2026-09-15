# Campus Placement Drive & Eligibility Screening Engine

##  Project Overview

The **Campus Placement Drive & Eligibility Screening Engine** is a Java-based application designed to simplify and automate the campus placement process.

In a college placement drive, placement cells need to evaluate a large number of students based on different company eligibility criteria such as:

- Minimum CGPA
- Maximum allowed backlogs
- Department eligibility
- Required technical skills

This project provides a rule-based screening system that automatically evaluates student profiles against company requirements. It also provides interview round tracking, placement analytics, and automated offer letter generation.

The application uses **Java 8 Stream API and Predicate chains** to implement the eligibility screening logic efficiently.

---

## Objectives

The main objectives of this project are:

1. To automate student eligibility screening during placement drives.
2. To reduce manual effort for placement coordinators.
3. To apply multiple eligibility conditions simultaneously.
4. To track candidates through different interview rounds.
5. To calculate basic placement analytics.
6. To generate an offer letter for successfully placed candidates.
7. To demonstrate practical implementation of Java programming concepts.

---

##  Key Features

### 1. Student Management

The system maintains student information including:

- Student ID
- Student Name
- Department
- CGPA
- Number of backlogs
- Technical skills
- Placement status

---

### 2. Job Opening Management

The application maintains company job opening information such as:

- Job ID
- Company name
- Job role
- Eligible department
- Minimum CGPA
- Maximum allowed backlogs
- Required skill
- CTC offered

---

### 3. Rule-Based Screening Engine

The main feature of the project is the automated eligibility screening engine.

Students are evaluated using multiple conditions:

```text
CGPA Requirement
       +
Backlog Requirement
       +
Department Requirement
       +
Required Skill
       ↓
Eligible / Not Eligible
