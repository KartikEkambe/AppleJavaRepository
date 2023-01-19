package writtenPrograms06Inheritance;

public class IdProof extends Person {
	String name,validity;
	public void setName(String name) {
		this.name = name;
	}
	public void setValidity(String validity) {
		this.validity = validity;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	int number;
	
	void display() {
		if(idproof=="Adhaar Card" && address=="Pune" ) {
			super.display();
			
			System.out.println("Id Number : "+number);
			System.out.println("Validity : "+validity);
		}
		else {
			System.out.println("Please enter valid idprooof");
		}
	}
	
	
}
