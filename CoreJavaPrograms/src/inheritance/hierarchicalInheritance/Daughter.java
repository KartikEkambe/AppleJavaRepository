package inheritance.hierarchicalInheritance;

public class Daughter extends Father {
	
	String name;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	void education() {
		System.out.println("Daughter is an Engineer");
	}
	void address() {
		System.out.println("Sawari Tq.Nilanga Dist.Latur");
	}

}
