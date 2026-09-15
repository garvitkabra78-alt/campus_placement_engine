import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CampusPlacementEngine {

    // ============================================================
    // DATA MODEL 1: STUDENT
    // ============================================================

    public static class Student {
        private String id;
        private String name;
        private String department;
        private double cgpa;
        private int backlogs;
        private Set<String> skills;
        private String status;

        public Student(String id, String name, String department,
                       double cgpa, int backlogs, Set<String> skills) {

            this.id = id;
            this.name = name;
            this.department = department;
            this.cgpa = cgpa;
            this.backlogs = backlogs;
            this.skills = skills;
            this.status = "Registered";
        }

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getDepartment() {
            return department;
        }

        public double getCgpa() {
            return cgpa;
        }

        public int getBacklogs() {
            return backlogs;
        }

        public Set<String> getSkills() {
            return skills;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        @Override
        public String toString() {
            return id + " - " + name;
        }
    }


    // ============================================================
    // DATA MODEL 2: JOB OPENING
    // ============================================================

    public static class JobOpening {
        private String id;
        private String company;
        private String role;
        private String department;
        private double minCgpa;
        private int maxBacklogs;
        private String requiredSkill;
        private double ctcLpa;

        public JobOpening(String id, String company, String role,
                          String department, double minCgpa,
                          int maxBacklogs, String requiredSkill,
                          double ctcLpa) {

            this.id = id;
            this.company = company;
            this.role = role;
            this.department = department;
            this.minCgpa = minCgpa;
            this.maxBacklogs = maxBacklogs;
            this.requiredSkill = requiredSkill;
            this.ctcLpa = ctcLpa;
        }

        public String getId() {
            return id;
        }

        public String getCompany() {
            return company;
        }

        public String getRole() {
            return role;
        }

        public String getDepartment() {
            return department;
        }

        public double getMinCgpa() {
            return minCgpa;
        }

        public int getMaxBacklogs() {
            return maxBacklogs;
        }

        public String getRequiredSkill() {
            return requiredSkill;
        }

        public double getCtcLpa() {
            return ctcLpa;
        }

        @Override
        public String toString() {
            return company + " - " + role + " (" + id + ")";
        }
    }


    // ============================================================
    // APPLICATION STATE
    // ============================================================

    private static final List<Student> students = new ArrayList<>();
    private static final List<JobOpening> jobs = new ArrayList<>();

    private static final Scanner sc = new Scanner(System.in);


    // ============================================================
    // MAIN METHOD
    // ============================================================

    public static void main(String[] args) {

        seedInitialData();

        System.out.println("=================================================");
        System.out.println("     CAMPUS PLACEMENT DRIVE ENGINE");
        System.out.println("=================================================");

        System.out.println("\nSystem initialized successfully!");
        System.out.println("Rule-Based Screening Engine: ACTIVE");
        System.out.println("Java Stream API + Predicate Chain: ACTIVE");

        mainMenu();
    }


    // ============================================================
    // INITIAL DATA
    // ============================================================

    private static void seedInitialData() {

        students.add(
                new Student(
                        "STU001",
                        "Aarav Sharma",
                        "CSE",
                        8.5,
                        0,
                        new HashSet<>(Arrays.asList(
                                "Java", "SQL", "Spring"
                        ))
                )
        );

        students.add(
                new Student(
                        "STU002",
                        "Priya Patel",
                        "ECE",
                        7.2,
                        1,
                        new HashSet<>(Arrays.asList(
                                "C++", "Embedded", "Python"
                        ))
                )
        );

        students.add(
                new Student(
                        "STU003",
                        "Rohan Verma",
                        "CSE",
                        9.1,
                        0,
                        new HashSet<>(Arrays.asList(
                                "Java", "React", "AWS"
                        ))
                )
        );

        students.add(
                new Student(
                        "STU004",
                        "Ananya Singh",
                        "MECH",
                        6.8,
                        0,
                        new HashSet<>(Arrays.asList(
                                "AutoCAD", "Python"
                        ))
                )
        );

        students.add(
                new Student(
                        "STU005",
                        "Vikram Das",
                        "CSE",
                        7.8,
                        2,
                        new HashSet<>(Arrays.asList(
                                "Java", "SQL"
                        ))
                )
        );


        jobs.add(
                new JobOpening(
                        "JOB001",
                        "TechCorp Systems",
                        "Software Engineer",
                        "CSE",
                        7.5,
                        0,
                        "Java",
                        12.5
                )
        );

        jobs.add(
                new JobOpening(
                        "JOB002",
                        "Silicon Embedded",
                        "Hardware Engineer",
                        "ECE",
                        7.0,
                        1,
                        "C++",
                        8.0
                )
        );

        jobs.add(
                new JobOpening(
                        "JOB003",
                        "Global Data Analytics",
                        "Data Analyst",
                        "ALL",
                        6.5,
                        0,
                        "Python",
                        10.0
                )
        );
    }


    // ============================================================
    // MAIN MENU
    // ============================================================

    private static void mainMenu() {

        while (true) {

            System.out.println("\n");
            System.out.println("=================================================");
            System.out.println("                 MAIN MENU");
            System.out.println("=================================================");

            System.out.println("1. Dashboard & Analytics");
            System.out.println("2. Student Directory");
            System.out.println("3. Rule-Based Screening Engine");
            System.out.println("4. Interview Tracker");
            System.out.println("5. Generate Offer Letter");
            System.out.println("6. View Job Openings");
            System.out.println("7. Exit");

            System.out.println("=================================================");
            System.out.print("Enter your choice: ");

            int choice = readInt();

            switch (choice) {

                case 1:
                    showDashboard();
                    break;

                case 2:
                    showStudents();
                    break;

                case 3:
                    runPredicateScreening();
                    break;

                case 4:
                    interviewTracker();
                    break;

                case 5:
                    generateOfferLetter();
                    break;

                case 6:
                    showJobs();
                    break;

                case 7:
                    System.out.println("\nThank you for using Campus Placement Engine!");
                    System.out.println("Program terminated successfully.");
                    return;

                default:
                    System.out.println("\nInvalid choice! Please try again.");
            }
        }
    }


    // ============================================================
    // MODULE 1: DASHBOARD & ANALYTICS
    // ============================================================

    private static void showDashboard() {

        System.out.println("\n=================================================");
        System.out.println("             PLACEMENT DASHBOARD");
        System.out.println("=================================================");

        long total = students.size();

        long placed = students.stream()
                .filter(s -> "Placed".equals(s.getStatus()))
                .count();

        double avgCtc = jobs.stream()
                .mapToDouble(JobOpening::getCtcLpa)
                .average()
                .orElse(0.0);

        System.out.println("Total Candidates       : " + total);
        System.out.println("Placed Candidates      : " + placed);
        System.out.println("Average CTC (LPA)      : ₹" +
                String.format("%.1f", avgCtc));

        System.out.println("\n-------------------------------------------------");
        System.out.println("System Status");
        System.out.println("-------------------------------------------------");

        System.out.println("Rule Engine            : ACTIVE");
        System.out.println("Stream API             : ACTIVE");
        System.out.println("Predicate Screening    : ACTIVE");
        System.out.println("Interview Tracking     : ACTIVE");
        System.out.println("Offer Generator        : ACTIVE");

        System.out.println("\nSupported Criteria:");
        System.out.println("• CGPA Cutoff");
        System.out.println("• Active Backlogs");
        System.out.println("• Department Eligibility");
        System.out.println("• Required Skills");

        pause();
    }


    // ============================================================
    // MODULE 2: STUDENT DIRECTORY
    // ============================================================

    private static void showStudents() {

        System.out.println("\n=================================================");
        System.out.println("              STUDENT DIRECTORY");
        System.out.println("=================================================");

        System.out.printf(
                "%-8s %-18s %-8s %-7s %-9s %-25s %-20s%n",
                "ID",
                "Name",
                "Dept",
                "CGPA",
                "Backlogs",
                "Skills",
                "Status"
        );

        System.out.println(
                "------------------------------------------------------------------------------------------------"
        );

        for (Student s : students) {

            System.out.printf(
                    "%-8s %-18s %-8s %-7.2f %-9d %-25s %-20s%n",
                    s.getId(),
                    s.getName(),
                    s.getDepartment(),
                    s.getCgpa(),
                    s.getBacklogs(),
                    String.join(", ", s.getSkills()),
                    s.getStatus()
            );
        }

        pause();
    }


    // ============================================================
    // MODULE 3: JOB OPENINGS
    // ============================================================

    private static void showJobs() {

        System.out.println("\n=================================================");
        System.out.println("                 JOB OPENINGS");
        System.out.println("=================================================");

        for (int i = 0; i < jobs.size(); i++) {

            JobOpening job = jobs.get(i);

            System.out.println("\n[" + (i + 1) + "] " + job.getCompany());

            System.out.println("Job ID           : " + job.getId());
            System.out.println("Role             : " + job.getRole());
            System.out.println("Department       : " + job.getDepartment());
            System.out.println("Minimum CGPA     : " + job.getMinCgpa());
            System.out.println("Maximum Backlogs : " + job.getMaxBacklogs());
            System.out.println("Required Skill   : " + job.getRequiredSkill());
            System.out.println("CTC              : ₹" + job.getCtcLpa() + " LPA");
        }

        pause();
    }


    // ============================================================
    // MODULE 4: RULE-BASED SCREENING ENGINE
    // ============================================================

    private static void runPredicateScreening() {

        System.out.println("\n=================================================");
        System.out.println("        RULE-BASED SCREENING ENGINE");
        System.out.println("=================================================");

        showJobs();

        System.out.print("\nSelect Job Opening Number: ");

        int jobChoice = readInt();

        if (jobChoice < 1 || jobChoice > jobs.size()) {

            System.out.println("Invalid job selection.");
            return;
        }

        JobOpening selectedJob = jobs.get(jobChoice - 1);

        System.out.println("\nSelected Job:");
        System.out.println(selectedJob);

        System.out.println("\nScreening Criteria:");
        System.out.println("Minimum CGPA     : " + selectedJob.getMinCgpa());
        System.out.println("Maximum Backlogs : " + selectedJob.getMaxBacklogs());
        System.out.println("Department       : " + selectedJob.getDepartment());
        System.out.println("Required Skill   : " + selectedJob.getRequiredSkill());

        // ---------------------------------------------------------
        // JAVA 8 PREDICATE CHAIN
        // ---------------------------------------------------------

        Predicate<Student> cgpaFilter =
                s -> s.getCgpa() >= selectedJob.getMinCgpa();

        Predicate<Student> backlogFilter =
                s -> s.getBacklogs() <= selectedJob.getMaxBacklogs();

        Predicate<Student> deptFilter =
                s -> selectedJob.getDepartment().equalsIgnoreCase("ALL")
                        || s.getDepartment()
                        .equalsIgnoreCase(selectedJob.getDepartment());

        Predicate<Student> skillFilter =
                s -> s.getSkills()
                        .stream()
                        .anyMatch(
                                skill -> skill.equalsIgnoreCase(
                                        selectedJob.getRequiredSkill()
                                )
                        );

        // Combining all conditions
        Predicate<Student> eligibilityRule =
                cgpaFilter
                        .and(backlogFilter)
                        .and(deptFilter)
                        .and(skillFilter);


        // ---------------------------------------------------------
        // STREAM API
        // ---------------------------------------------------------

        List<Student> eligibleCandidates =
                students.stream()
                        .filter(eligibilityRule)
                        .collect(Collectors.toList());


        // ---------------------------------------------------------
        // DISPLAY RESULT
        // ---------------------------------------------------------

        System.out.println("\n=================================================");
        System.out.println("              SCREENING RESULTS");
        System.out.println("=================================================");

        if (eligibleCandidates.isEmpty()) {

            System.out.println("No candidates met all eligibility criteria.");

        } else {

            System.out.println(
                    eligibleCandidates.size()
                            + " candidate(s) passed screening.\n"
            );

            for (Student s : eligibleCandidates) {

                System.out.println("-----------------------------------------");

                System.out.println("Student ID : " + s.getId());
                System.out.println("Name       : " + s.getName());
                System.out.println("Department : " + s.getDepartment());
                System.out.println("CGPA       : " + s.getCgpa());
                System.out.println("Backlogs   : " + s.getBacklogs());
                System.out.println("Skills     : "
                        + String.join(", ", s.getSkills()));
                System.out.println("Status     : PASSED SCREENING");
            }

            System.out.println("-----------------------------------------");
        }

        pause();
    }


    // ============================================================
    // MODULE 5: INTERVIEW TRACKER
    // ============================================================

    private static void interviewTracker() {

        while (true) {

            System.out.println("\n=================================================");
            System.out.println("              INTERVIEW TRACKER");
            System.out.println("=================================================");

            showStudents();

            System.out.print("\nSelect Student Number: ");

            int studentChoice = readInt();

            if (studentChoice < 1 || studentChoice > students.size()) {

                System.out.println("Invalid student selection.");
                return;
            }

            Student selectedStudent =
                    students.get(studentChoice - 1);

            System.out.println("\nSelected Candidate:");
            System.out.println("Name   : " + selectedStudent.getName());
            System.out.println("Status : " + selectedStudent.getStatus());

            System.out.println("\nChoose Action:");

            System.out.println("1. Pass Aptitude Round");
            System.out.println("2. Pass Technical Interview");
            System.out.println("3. Pass HR Round & Place");
            System.out.println("4. Back to Main Menu");

            System.out.print("Enter choice: ");

            int choice = readInt();

            switch (choice) {

                case 1:

                    selectedStudent.setStatus("Aptitude Cleared");

                    System.out.println(
                            "\nAptitude round cleared for "
                                    + selectedStudent.getName()
                    );

                    break;


                case 2:

                    selectedStudent.setStatus("Technical Cleared");

                    System.out.println(
                            "\nTechnical interview cleared for "
                                    + selectedStudent.getName()
                    );

                    break;


                case 3:

                    selectedStudent.setStatus("Placed");

                    System.out.println(
                            "\nHR round cleared!"
                    );

                    System.out.println(
                            selectedStudent.getName()
                                    + " is now PLACED."
                    );

                    break;


                case 4:
                    return;


                default:
                    System.out.println("Invalid choice.");
            }
        }
    }


    // ============================================================
    // MODULE 6: OFFER LETTER GENERATOR
    // ============================================================

    private static void generateOfferLetter() {

        System.out.println("\n=================================================");
        System.out.println("             OFFER LETTER GENERATOR");
        System.out.println("=================================================");

        showStudents();

        System.out.print("\nSelect Student Number: ");

        int studentChoice = readInt();

        if (studentChoice < 1 || studentChoice > students.size()) {

            System.out.println("Invalid student selection.");
            return;
        }

        Student student = students.get(studentChoice - 1);

        if (!"Placed".equals(student.getStatus())) {

            System.out.println(
                    "\nOffer letter can only be generated "
                            + "for PLACED candidates."
            );

            pause();
            return;
        }

        showJobs();

        System.out.print("\nSelect Job Opening Number: ");

        int jobChoice = readInt();

        if (jobChoice < 1 || jobChoice > jobs.size()) {

            System.out.println("Invalid job selection.");
            return;
        }

        JobOpening job = jobs.get(jobChoice - 1);


        String offerText =
                "=================================================\n" +
                "             OFFER OF EMPLOYMENT\n" +
                "=================================================\n\n" +

                "Date: September 13, 2026\n" +

                "Candidate Name : " + student.getName() + "\n" +
                "Student ID     : " + student.getId() + "\n" +
                "Department     : " + student.getDepartment() + "\n\n" +

                "Dear " + student.getName() + ",\n\n" +

                "We are pleased to extend an offer for the position of\n" +

                "'" + job.getRole() + "' at "
                        + job.getCompany() + ".\n\n" +

                "Compensation Package: ₹"
                        + job.getCtcLpa() + " LPA\n" +

                "Status              : OFFICIAL OFFER\n\n" +

                "Congratulations on completing all recruitment rounds!\n\n" +

                "Regards,\n" +
                "University Placement Office\n" +

                "=================================================";


        System.out.println("\n");
        System.out.println(offerText);

        pause();
    }


    // ============================================================
    // INPUT METHOD
    // ============================================================

    private static int readInt() {

        while (true) {

            try {

                return Integer.parseInt(sc.nextLine());

            } catch (NumberFormatException e) {

                System.out.print(
                        "Please enter a valid number: "
                );
            }
        }
    }


    // ============================================================
    // PAUSE METHOD
    // ============================================================

    private static void pause() {

        System.out.println("\nPress ENTER to continue...");

        sc.nextLine();
    }
}