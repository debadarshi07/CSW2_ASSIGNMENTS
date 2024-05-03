package Q4;

public class Employee {
	String name,age,dob;

	Employee(String name,String age,String dob){
		this.name=name;
		this.age=age;
		this.dob=dob;
	}

	String generatePassword(){
		int lastNameIndex=this.name.lastIndexOf(" ");
		int lastDobIndex=this.dob.lastIndexOf("/");
		return this.name.substring(lastNameIndex)+this.dob.substring(lastDobIndex+1);
	}

	void printEmployee(){
		int firstNameIndex=this.name.indexOf(" ");
		int lastNameIndex=this.name.lastIndexOf(" ");
		System.out.println("First name :"+this.name.substring(0,firstNameIndex));
		System.out.println("Middle name :"+this.name.substring(firstNameIndex,lastNameIndex));
		System.out.println("Last name :"+this.name.substring(lastNameIndex));
		System.out.println("DOB: "+this.dob);
		System.out.println("Age: "+this.age);
	}

	static Employee createEmployee(String data){
		String dataArr[]=data.split(",");
		return new Employee(dataArr[0],dataArr[1],dataArr[2]);
	}

	public static void main(String[] args) {

		Employee e1=new Employee("Debadarshi Omkar","20","01/34/2003");
		System.out.println("Generated password: "+e1.generatePassword());
		e1.printEmployee();

		Employee e2=createEmployee("Animesh Patra,23,01/98/89");
		e2.printEmployee();
	}
}
