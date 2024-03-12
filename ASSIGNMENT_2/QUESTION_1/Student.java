package Q1;

public class Student<T> {
	T name,rollNo,age;
	
	public Student(T name,T rollNo,T age) {
		this.name=name;
		this.rollNo=rollNo;
		this.age=age;
	}
	
	public String toString() {
		return "Name: "+name+", Roll No: "+rollNo+", Age: "+age;
	}
}
