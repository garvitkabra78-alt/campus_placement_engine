public class InterviewTracker {

    public static void passAptitude(Student student) {

        student.setStatus("Aptitude Cleared");

        System.out.println(
                student.getName()
                + " cleared the Aptitude Round."
        );
    }

    public static void passTechnical(Student student) {

        student.setStatus("Technical Cleared");

        System.out.println(
                student.getName()
                + " cleared the Technical Interview."
        );
    }

    public static void passHR(Student student) {

        student.setStatus("Placed");

        System.out.println(
                student.getName()
                + " cleared the HR Round and is PLACED."
        );
    }
}
