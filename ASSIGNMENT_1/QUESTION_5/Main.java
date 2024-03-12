package Q5;

public class Main {
    public static void main(String[] args) {
        
        College c1=new College("ITER", "Bhubaneswar");
        College c2=new College("IIT", "Bombay");

        Student s1=new Student("Debadarshi Omkar", 5006, c1);
        Student s2=new Student("Virat Kohli", 5018, c2);

        s1.displayStudentInfo();
        System.out.println();
        s2.displayStudentInfo();
        
    }
    
}

