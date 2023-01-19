package writtenPrograms06Inheritance;

public class Person {
	int id;
	String pname,contact,address,idproof;
	public void setId(int id) {
		this.id = id;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setIdproof(String idproof) {
		this.idproof = idproof;
	}
	
	void display() {
		System.out.println("Person id :"+id);
		System.out.println("Person Name :"+pname);
		System.out.println("Person Contact :"+contact);
		System.out.println("Person Address :"+address);
		System.out.println("Person IDproof :"+idproof);
	}

	


}
