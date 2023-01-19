package collectionMaps.treeMap;

public class Person implements Comparable<Person>{
	int id;
	String name,email,city;
	public Person(int id, String name, String email, String city) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.city = city;
	}
	
	public String toString() {
		return id+" "+name+" "+email+" "+city;
	}
	
	public int compareTo(Person p) {
		return this.id-p.id;
	}

	
}
