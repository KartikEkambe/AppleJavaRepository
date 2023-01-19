package collectionMaps.treeMap;

import java.util.TreeMap;
public class PersonTreeMap {
	void setData(TreeMap<Person, Integer> tm) {
		tm.put(new Person(101,"Vaibhav","vaibhav@gmail.com","Nagpur"), 23);
		tm.put(new Person(12,"Anil","anil@gmail.com","Pune"), 26);
		tm.put(new Person(11,"Audu","audu@gmail.com","Latur"), 22);
		tm.put(new Person(1022,"Kartik","kartik@gmail.com","Latur"), 23);
		tm.put(new Person(123,"Bhagyashree","bhagya@gmail.com","Beed"), 25);
		tm.put(new Person(235,"Pravin","pravin@gmail.com","Pune"), 23);
		tm.put(new Person(654,"Sanu","sanu@gmail.com","Pune"), 19);
	}

	public static void main(String[] args) {
		TreeMap<Person, Integer> tm = new TreeMap<Person, Integer>(new PersonNameComparator());
		PersonTreeMap o=new PersonTreeMap();
		o.setData(tm);
		
		System.out.println(tm);
	}

}
