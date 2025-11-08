public class Student {
    private String id, name, subject, grade;
    private double marks;
    public Student(String id, String name, String subject, double marks) {
        this.id = id; this.name = name; this.subject = subject;
        this.marks = marks; this.grade = calculateGrade(marks);
    }
    public static String calculateGrade(double marks) {
        if (marks >= 90) return "A+";
        if (marks >= 75) return "A";
        if (marks >= 60) return "B";
        if (marks >= 50) return "C";
        return "F";
    }
}
