import java.util.Set;

public class Student {

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
