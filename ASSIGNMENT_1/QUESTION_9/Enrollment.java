package Q9;

class Enrollment implements EnrollmentSystem {
    private Map<Course, List<Student>> enrollments;

    public Enrollment() {
        enrollments = new HashMap<>();
    }

    @Override
    public void enrollStudent(Student student, Course course) {
        if (!enrollments.containsKey(course)) {
            enrollments.put(course, new ArrayList<>());
        }
        List<Student> students = enrollments.get(course);
        if (course.enrollStudent(student)) {
            students.add(student);
            System.out.println(student.getName() + " enrolled in " + course.getName());
        } else {
            System.out.println("Course " + course.getName() + " is full. Enrollment failed for " + student.getName());
        }
    }

    @Override
    public void dropStudent(Student student, Course course) {
        if (enrollments.containsKey(course)) {
            List<Student> students = enrollments.get(course);
            if (students.contains(student)) {
                course.dropStudent(student);
                students.remove(student);
                System.out.println(student.getName() + " dropped from " + course.getName());
            } else {
                System.out.println(student.getName() + " is not enrolled in " + course.getName());
            }
        } else {
            System.out.println("No enrollment record found for " + course.getName());
        }
    }

    @Override
    public void displayEnrollmentDetails() {
        for (Map.Entry<Course, List<Student>> entry : enrollments.entrySet()) {
            Course course = entry.getKey();
            List<Student> students = entry.getValue();
            System.out.println("Course: " + course.getName() + ", Enrolled Students: ");
            for (Student student : students) {
                System.out.println("- " + student.getName());
            }
        }
    }
}
