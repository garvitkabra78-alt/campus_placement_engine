import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ScreeningEngine {

    public static List<Student> screenStudents(
            List<Student> students,
            JobOpening job) {

        // CGPA condition
        Predicate<Student> cgpaFilter =
                s -> s.getCgpa() >= job.getMinCgpa();

        // Backlog condition
        Predicate<Student> backlogFilter =
                s -> s.getBacklogs() <= job.getMaxBacklogs();

        // Department condition
        Predicate<Student> deptFilter =
                s -> job.getDepartment().equalsIgnoreCase("ALL")
                        || s.getDepartment()
                           .equalsIgnoreCase(job.getDepartment());

        // Required skill condition
        Predicate<Student> skillFilter =
                s -> s.getSkills()
                        .stream()
                        .anyMatch(skill ->
                                skill.equalsIgnoreCase(
                                        job.getRequiredSkill()));

        // Combine all conditions
        Predicate<Student> eligibilityRule =
                cgpaFilter
                        .and(backlogFilter)
                        .and(deptFilter)
                        .and(skillFilter);

        // Stream API
        return students.stream()
                .filter(eligibilityRule)
                .collect(Collectors.toList());
    }
}
