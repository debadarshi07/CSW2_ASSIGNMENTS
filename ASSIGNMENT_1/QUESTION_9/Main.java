package Q9;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("1001", "Alice");
        Student student2 = new Student("1002", "Bob");

        Course course1 = new Course("CSCI101", "Introduction to Computer Science", 30);
        Course course2 = new Course("MATH101", "Calculus I", 25);

        EnrollmentSystem enrollmentSystem = new Enrollment();
        enrollmentSystem.enrollStudent(student1, course1);
        enrollmentSystem.enrollStudent(student2, course1);

        enrollmentSystem.enrollStudent(student1, course2);
        enrollmentSystem.enrollStudent(student2, course2);

        enrollmentSystem.displayEnrollmentDetails();

        enrollmentSystem.dropStudent(student1, course1);
        enrollmentSystem.dropStudent(student2, course2);

        enrollmentSystem.displayEnrollmentDetails();
    }
}
