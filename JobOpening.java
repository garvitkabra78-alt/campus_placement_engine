public class JobOpening {

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
