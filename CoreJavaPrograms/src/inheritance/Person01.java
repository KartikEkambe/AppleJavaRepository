package inheritance;

public class Person01 {
	private String name;
	private int age;
	private String contact;
	IdProof01 idproof;

	public Person01(String name, int age, String contact, IdProof01 idproof) {
		this.name = name;
		this.age = age;
		this.contact = contact;
		this.idproof = idproof;
	}

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

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public IdProof01 getIdproof() {
		return idproof;
	}

	public void setIdproof(IdProof01 idproof) {
		this.idproof = idproof;
	}
	
	public String toString() {
		return name+" "+age+" "+contact+"\n"+idproof;
	}

}
