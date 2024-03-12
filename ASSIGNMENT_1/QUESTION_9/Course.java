package Q9;

public class Course {
   private String courseId;
    private String name;
    private int maxCapacity;
    private List<Student> enrolledStudents;

    public Course(String courseId, String name, int maxCapacity) {
        this.courseId = courseId;
        this.name = name;
        this.maxCapacity = maxCapacity;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseId() {
        return courseId;
    }

    public String getName() {
        return name;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public boolean enrollStudent(Student student) {
        if (enrolledStudents.size() < maxCapacity) {
            enrolledStudents.add(student);
            return true;
        }
        return false;
    }

    public void dropStudent(Student student) {
        enrolledStudents.remove(student);
    }
  }
}
