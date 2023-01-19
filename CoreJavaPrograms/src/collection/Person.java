package collection;

public class Person {

	int id;
	String name,contact;
	Address add;
	public Person(int id, String name, String contact, Address add) {
		
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.add = add;
	}
	public String toString() {
		return id+" "+name+" "+contact+" "+add;
	}
}
