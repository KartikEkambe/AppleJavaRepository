package inheritance.hierarchicalInheritance;

public class Son extends Father {
	String name;
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
	int age;
	
	void education() {
		System.out.println("Son is an Developer");
	}
	void address() {
		System.out.println("Sawari Tq.Nilanga Dist.Latur");
	}

}
