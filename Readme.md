# Campus Placement Drive & Eligibility Screening Engine

##  Project Overview

The Campus Placement Drive & Eligibility Screening Engine is a Java-based application
designed to help college placement cells manage student profiles, recruiter job openings,
eligibility screening, interview rounds, placement analytics, and offer generation.
In traditional placement processes, placement coordinators may need to manually check
thousands of student records against different company eligibility criteria such as CGPA, active
backlogs, department restrictions, and required skills. This can be time-consuming and may lead
to errors.
Objectives
The main objectives of the project are: -
To maintain student academic and skill information.
- To maintain company job opening information.
- To automatically identify eligible students.
- To reduce manual effort in the placement screening process.
- To track students through different interview rounds.
- To maintain placement status.
- To generate offer information for selected students.
Features
1 Student Management
The Student module maintains information such as: -
Student ID
- Student Name
- Department
- CGPA
- Number of backlogs
- Technical skills
- Placement status
The application provides a Student Directory to display the available student records.
2. Job Opening Management
The system maintains job opening information including:
- Job ID
- Company name
- Job role
- Eligible department
- Minimum CGPA
- Maximum allowed backlogs
- Required technical skill
- CTC offered
3. Rule-Based Eligibility Screening
The main feature of the project is the Rule-Based Screening Engine.
Students are evaluated using multiple conditions:
1. Minimum CGPA
2. Maximum allowed backlogs
3. Department eligibility
4. Required technical skill
Technologies and Tools Used –
Java - Main programming language
Java 8 Stream API - Student filtering and data processing
Predicate – Eligibility rule implementation
OOP – Classes, objects and encapsulation
Collections – ArrayList and HashSet for data management
Installation Requirements
Before running the project, install:
• Java JDK 8 or above
• Visual Studio Code or any Java-supported IDE
To check whether Java is installed, open the terminal and run:
java -version
How to Install and Run
Step 1: Download the Project
Download or clone the project from the GitHub repository.
git clone https://github.com/garvitkabra78-alt/campus_placement_engine.git
Step 2: Open the Project
Open the downloaded project folder in Visual Studio Code.
Step 3: Open Terminal
In VS Code, open:
Terminal → New Terminal
Navigate to the folder containing:
CampusPlacementEngine.java
Step 4: Compile the Program
Run:
javac CampusPlacementEngine.java
If there are no compilation errors, the program has been compiled successfully.
Step 5: Run the Program
Run:
java CampusPlacementEngine
The application will start in the terminal.
Testing Instructions
The project can be tested by running the application and checking each major module.
Test Case 1: Dashboard
Steps:
1. Run the application.
2. Select option 1.
3. Check the displayed candidate and CTC information.
Expected Result:
The dashboard displays the placement statistics and system status.
Test Case 2: Student Directory
Steps:
1. Select option 2.
2. View the student records.

Screenshot:
<img width="816" height="820" alt="image" src="https://github.com/user-attachments/assets/71387f27-1a69-4807-aafb-9c361c4b2638" />
<img width="711" height="577" alt="image" src="https://github.com/user-attachments/assets/9f7599e5-6f42-443a-ad72-e3984db5cea2" />


