package Q4;

public class Student implements Comparable<Student>{
	String name;
	int rn,totalMark;
	
	Student(String name,int rn,int totalMark){
		this.name=name;
		this.rn=rn;
		this.totalMark=totalMark;
	}
	
	@Override
	public int compareTo(Student o) {
		if(this.name==o.name && this.rn==o.rn && this.totalMark==o.totalMark)
			return 0;
		else return -1;
	}
	
	public static void findStudent(Student arr[],Student target) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i].compareTo(target)==0)
				System.out.println("Student details present at:"+i);
		}
	}
	
	public static void main(String[] args) {
		
		
		Student s1=new Student("Deb",26,30);
		Student s2=new Student("Rohit",45,29);
		Student s3=new Student("Virat",18,35);
		Student s4=new Student("Shubhman",77,33);
		Student s5=new Student("Yashasvi",64,31);
		Student s6=new Student("Kuldeep",23,28);

		Student target=new Student("Rohit",45,29);
		
		Student students[]= {s1,s2,s4,s6,s3,s5};
		
		findStudent(students,target);
	}
	
}
