import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import java.util.*;
import java.util.function.Predicate;
import static org.junit.jupiter.api.Assertions.*;

public class PlacementEngineTest {

    @Test
    @DisplayName("Boundary Condition: Student exactly matching min CGPA cutoff")
    public void testExactCgpaBoundary() {
        CampusPlacementEngine.Student student = new CampusPlacementEngine.Student(
                "T01", "Boundary Test", "CSE", 7.5, 0, new HashSet<>(Arrays.asList("Java"))
        );

        Predicate<CampusPlacementEngine.Student> cgpaRule = s -> s.getCgpa() >= 7.5;
        assertTrue(cgpaRule.test(student), "Student with exact cutoff CGPA should pass.");
    }

    @Test
    @DisplayName("Edge Case: Active backlogs exceed limit")
    public void testBacklogFiltering() {
        CampusPlacementEngine.Student student = new CampusPlacementEngine.Student(
                "T02", "Backlog Test", "CSE", 8.8, 2, new HashSet<>(Arrays.asList("Java"))
        );

        Predicate<CampusPlacementEngine.Student> backlogRule = s -> s.getBacklogs() <= 0;
        assertFalse(backlogRule.test(student), "Student with active backlogs should fail strict 0-backlog criteria.");
    }
}
