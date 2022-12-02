package inheritance.hierarchicalInheritance;

public class PersonStudentFacultyMain {

	public static void main(String[] args) {
		System.out.println("Student Information : ");

		Student s1=new Student();
		s1.setId(101);
		s1.setName("Vaibhav");
		s1.setAge(23);
		s1.setContact("9696407047");
		s1.setPercent(86);
		System.out.println(s1.getId()+" "+s1.getName()+" "+s1.getAge()+" "+s1.getContact()+" "+s1.getPercent()+" "+Student.college);
		s1.grade(86);
		
		System.out.println("\n  \n");
		
		
		
		System.out.println("Faculty Information : ");
		Faculty f1=new Faculty();
		f1.setId(111);
		f1.setName("Sanju");
		f1.setAge(22);
		f1.setContact("8888293184");
		f1.setSubject("Computer");
		f1.setSalary(25400);
		
		System.out.println(f1.getId()+" "+f1.getName()+" "+f1.getAge()+" "+f1.getContact()+" "+f1.getSubject()+" "+f1.getSalary());
		
		f1.pfCalsulator(25400);

	}

}
