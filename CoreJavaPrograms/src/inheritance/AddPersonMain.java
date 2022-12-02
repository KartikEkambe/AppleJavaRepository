package inheritance;

public class AddPersonMain {

	public static void main(String[] args) {
//		Address a = new Address("Hadapsar", "Pune", "Maharashtra", 412308);
//		Address a2 = new Address("Nilanga", "Latur", "Maharashtra", 413522);
//		Address a3 = new Address("Katraj", "Pune", "Maharashtra", 411037);
//		Person p1 = new Person(101, "Bali", "9096407047", "bali@gmail.com", a);
//		Person p2 = new Person(102, "Pravin", "8888888888", "pravin@gmail.com", a2);
//		Person p3 = new Person(103, "Madhav", "7670181153", "madhav@gmail.com", a);
//
//		System.out.println(p1);
//		System.out.println(p2);
//		System.out.println(p3);

		Address a1 = new Address();
		a1.setArea("Hadapsar");
		a1.setCity("Pune");
		a1.setState("Maharashtra");
		a1.setPincode(411028);

		Address a2 = new Address();
		a2.setArea("Katraj");
		a2.setCity("Pune");
		a2.setState("Maharashtra");
		a2.setPincode(411037);

		Address a3 = new Address();
		a3.setArea("Aurad");
		a3.setCity("Latur");
		a3.setState("Maharashtra");
		a3.setPincode(413522);

		Person p1 = new Person();
		p1.setId(101);
		p1.setName("Pavan");
		p1.setContact("9545556505");
		p1.setEmail("pavan@gmail.com");
		p1.setA(a1);
		System.out.println(p1);

		Person p2 = new Person();
		p2.setId(102);
		p2.setName("Vaibhav");
		p2.setContact("8888293184");
		p2.setEmail("vppatil@gmail.com");
		p2.setA(a2);
		System.out.println(p2);

		Person p3 = new Person();
		p3.setId(103);
		p3.setName("Audu");
		p3.setContact("9096000007");
		p3.setEmail("audumber@gmail.com");
		p3.setA(a3);

		System.out.println(p3);

	}

}
