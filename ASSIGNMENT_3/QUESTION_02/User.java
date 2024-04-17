package Q02;

public class User {
	private String name;
	private byte age;
	
	User(String name, byte age){
		this.name=name;
		this.age=age;
	}
	
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name=name;
	}
	
	byte getAge() {
		return age;
	}
	void setAge(byte age) {
		this.age=age;
	}
}
