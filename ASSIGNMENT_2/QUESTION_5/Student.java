package Q5;

class Student implements Comparable<Student> {
    private String name;
    private int rn;
    private int totalMarks;

    public Student(String name, int rn, int totalMarks) {
        this.name = name;
        this.rn = rn;
        this.totalMarks = totalMarks;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rn;
    }

    public int getTotalMarks() {
        return totalMarks;
    }
    
    @Override
    public int compareTo(Student otherStudent) {
        return Integer.compare(this.rn, otherStudent.rn);
    }
    
    
    public static void bubbleSort(Student[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    Student temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {
    	
        Student[] students = { new Student("Alice", 102, 85), new Student("Bob", 101, 75), new Student("Charlie", 103, 90) };
        
        bubbleSort(students);

        System.out.println("Sorted Students Array:");
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", Roll Number: " + student.getRollNumber() + ", Total Marks: " + student.getTotalMarks());
            
        }
    }

   
}

