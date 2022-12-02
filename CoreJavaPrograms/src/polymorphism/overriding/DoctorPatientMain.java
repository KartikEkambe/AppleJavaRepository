package polymorphism.overriding;

public class DoctorPatientMain {

	public static void main(String[] args) {
		Doctor d1=new Doctor();
		d1.setName("Vaibhav");
		d1.setContact("8888888888");
		d1.setGender("Male");
		d1.setAge(24);
		d1.setId(123);
		d1.setSpecilization("Dermatology");
		d1.setLisence("D-123-74849");
		
		d1.display();
		
		System.out.println("\n------------------------\n");
		Patient p1=new Patient();
		p1.setName("Pravin");
		p1.setContact("7878585858");
		p1.setGender("Male");
		p1.setAge(34);
		p1.setId(1056);
		p1.setBedno("Bed No 16");
		p1.setDisease("Skin");
		p1.display();



	}

}
