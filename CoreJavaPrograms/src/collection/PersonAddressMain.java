package collection;

import java.util.*;

public class PersonAddressMain {
	void addElement(ArrayList<Person> per) {
//		ArrayList<Person> al1=new ArrayList<Person>();

		per.add(new Person(101, "Kartik", "9096407047", new Address("Pune", "Maharashtra", "India")));
		per.add(new Person(102, "vaibhav", "9565477673", new Address("Nagpur", "Maharashtra", "India")));
		per.add(new Person(103, "Pravin", "8888888888", new Address("Latur", "Maharashtra", "India")));
		per.add(new Person(104, "Ravikiran", "8887566545", new Address("Banglore", "Karnataka", "India")));
		per.add(new Person(105, "Ram", "7378456578", new Address("pune", "Maharashtra", "India")));
		per.add(new Person(106, "Kanchan", "9687566545", new Address("Banglore", "Karnataka", "India")));
		per.add(new Person(104, "Satish", "7887566549", new Address("Pune", "Maharashtra", "India")));

	}
	
	void displayCityWise(ArrayList<Person>per) {
		for(Person p:per) {
			if(p.add.city.equalsIgnoreCase("pune"))
				System.out.println(p.name+" "+p.contact+" "+p.add.city);
		}
	}
	
	void removePerson(ArrayList<Person>per) {
		ListIterator<Person>litr=per.listIterator();
		while(litr.hasNext()) {
			Person p=litr.next();
			if(p.add.city.equalsIgnoreCase("banglore"))
				litr.remove();
		}
	}

	public static void main(String[] args) {
		ArrayList<Person> al = new ArrayList<Person>();
		PersonAddressMain pa = new PersonAddressMain();
		pa.addElement(al);
		System.out.println(al);
		pa.displayCityWise(al);
		pa.removePerson(al);
		System.out.println(al);
	}
}
