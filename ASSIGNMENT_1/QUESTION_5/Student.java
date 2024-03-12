package Q5;

public class Student {
    String studentName;
    int studentId;
    College info;

    public Student(String studentName, int studentId, College info){
        this.studentName=studentName;
        this.studentId=studentId;
        this.info=info;
    }

    public void displayStudentInfo(){
        System.out.println("Student details:");
        System.out.println("Name: "+this.studentName);
        System.out.println("Id: "+this.studentId);
        System.out.println("College Name: "+this.info.collegeName);
        System.out.println("College Location: "+this.info.collegeLocation);
    }

   
}

