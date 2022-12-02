package inheritance;

public class Person {
	private int id;
	private String name;
	private String contact;
	private String email;
	Address a;
	
	public void setA(Address a) {
		this.a=a;
	}
	public Address getA() {
		return a;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

//	Person(int id, String name, String contact, String email, Address a) {
//		this.id = id;
//		this.name = name;
//		this.contact = contact;
//		this.email = email;
//		this.a = a;
//	}

	public String toString() {
		return id + " " + name + " " + contact + " " + email + " " + a;
	}

}
