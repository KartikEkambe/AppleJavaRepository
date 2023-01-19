package collectionMaps;

import java.util.*;

public class EmployeeMapMain {
	void add(ArrayList<Employee> al) {
		al.add(new Employee(102,"Kinjal","Sales",60000));
		al.add(new Employee(32,"Kartik","Development",80000));
		al.add(new Employee(122,"Nitesh","HR",60000));
		al.add(new Employee(342,"Pramod","Marketing",65000));
		al.add(new Employee(151,"Kanchan","Development",80000));
		al.add(new Employee(69,"Atif","HR",60000));
		al.add(new Employee(58,"Vaibhav","Development",70000));
		al.add(new Employee(10,"Riya","Sales",60000));
		al.add(new Employee(2,"Rohit","Marketing",65000));
		al.add(new Employee(134,"Jitesh","Finance",55000));
		al.add(new Employee(345,"Bhagya","Development",65000));

	}
	
	void createMap(ArrayList<Employee> al,HashMap<String,Integer> hmdept,HashMap<Integer,Integer> hmsalary) {
		for(Employee e:al) {
			String dept=e.dept;
			if(hmdept.containsKey(dept)) {
				//int i=hm.get(dept);
				hmdept.put(dept, hmdept.get(dept)+1);
			}else {
				hmdept.put(dept, 1);
			}
		}
		
		
		for(Employee e:al) {
			int sal=e.salary;
			if(hmsalary.containsKey(sal)) {
				hmsalary.put(sal, hmsalary.get(sal)+1);
			}else {
				hmsalary.put(sal, 1);
			}
		}
	}
	
	void display(HashMap<String,Integer> hmdept,HashMap<Integer,Integer> hmsalary) {
		System.out.println("Display department wise frequency");

		for(Map.Entry<String, Integer> ent:hmdept.entrySet()) {
			System.out.println(ent.getKey()+" "+ent.getValue());
		}
		
		System.out.println("\nDisplay salary wise frequency");
		for(Map.Entry<Integer, Integer> ent:hmsalary.entrySet()) {
			System.out.println(ent.getKey()+" "+ent.getValue());
		}
	}

	public static void main(String[] args) {
		EmployeeMapMain emp=new EmployeeMapMain();

		ArrayList<Employee> al=new ArrayList<Employee>();
		emp.add(al);
		
		HashMap<String,Integer> hmdept=new HashMap<String, Integer>(); 
		HashMap<Integer,Integer> hmsalary=new HashMap<Integer, Integer>(); 
		emp.createMap(al, hmdept,hmsalary);
		emp.display(hmdept,hmsalary);
		

	}

}
