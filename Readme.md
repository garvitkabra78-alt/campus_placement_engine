# Campus Placement Drive & Eligibility Screening Engine

A Java 8 application designed for college placement cells to dynamically filter student profiles using custom predicate chains, track candidate interview rounds, analyze placement metrics, and issue employment offer documents.

## Key Features
- **Rule-Based Screening Engine:** Functional evaluation using Java 8 Stream API and composable `Predicate` chains (CGPA cutoffs, active backlogs, department matching, required skill tags).
- **Multi-Round Interview Tracker:** Operational advancement across recruitment stages (`Aptitude Cleared` → `Technical Cleared` → `Placed`).
- **Placement Analytics Dashboard:** Live calculation of candidate counts, placement ratios, and average CTC offerings.
- **Automated Offer Generator:** Instant issuance of formal employment letters for verified placed students.
- **Dual Interface:** Terminal Command Line Interface (CLI) and Swing Graphical User Interface (GUI).

## System Requirements
- **Java Development Kit (JDK):** Version 8 or higher.
- **Operating System:** Cross-platform (Linux, macOS, Windows).
- **Dependencies:** Built using standard Java standard libraries (`java.util.stream` and `javax.swing`).

## Setup & Execution Instructions

### 1. Compilation
Open your terminal in the root project directory and compile the Java class:
```bash
javac CampusPlacementEngine.java
java CampusPlacementEngine
java CampusPlacementEngine --gui
.
├── CampusPlacementEngine.java  # Core Application & Logic Engine
├── PlacementEngineTest.java    # JUnit 5 Boundary Unit Tests
├── statement.md                # System Scope & Target User Documentation
└── README.md                   # Project Setup Guide
