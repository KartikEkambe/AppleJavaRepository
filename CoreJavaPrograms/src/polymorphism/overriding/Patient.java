package polymorphism.overriding;

public class Patient extends Person {

	int id;
	String disease,bedno;
	public void setId(int id) {
		this.id = id;
	}
	public void setBedno(String bedno) {
		this.bedno = bedno;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	
	void display() {
		System.out.println("Patient Details : ");
		super.display();
		System.out.println(id+" "+disease+" "+bedno);
	}

}
