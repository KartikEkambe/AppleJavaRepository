package writtenPrograms05Polymorphism;

public class Person02 {
	private String name;
	private String gender;
	private int age;
	Address02 add;
	
	
	
	public Person02(String name, String gender, int age, Address02 add) {
		
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.add = add;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address02 getAdd() {
		return add;
	}
	public void setAdd(Address02 add) {
		this.add = add;
	}
	
	public String toString() {
		return name+" "+gender +" "+age+" "+add;
	}
	
}
