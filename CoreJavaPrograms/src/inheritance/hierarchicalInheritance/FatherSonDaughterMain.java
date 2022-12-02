package inheritance.hierarchicalInheritance;

public class FatherSonDaughterMain {

	public static void main(String[] args) {
		Son s=new Son();
		s.setName("Kartik");
		s.setAge(23);
		System.out.println("Son Information : ");
		System.out.println(s.getName()+" "+Son.fname+" "+Son.surname+" "+s.getAge());
		s.education();
		s.address();
		
		System.out.println("\n--------------------------------------------\n");
		
		Daughter d=new Daughter();
		d.setName("Anita");
		d.setAge(27);
		System.out.println("Daughter Information : ");
		System.out.println(d.getName()+" "+Daughter.fname+" "+Daughter.surname+" "+d.getAge());
		d.education();
		d.address();

	}

}
