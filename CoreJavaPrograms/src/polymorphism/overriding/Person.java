package polymorphism.overriding;

public class Person {
	String name,contact,gender;
	int age;

	public void setName(String name) {
		this.name = name;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	void display() {
		System.out.println(name+" "+contact+" "+gender+" "+age);
	}
	

}
