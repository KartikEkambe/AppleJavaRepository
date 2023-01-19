package comparableAndComparator;

public class Employee implements Comparable<Employee> {
int id;
String name,dept;
int salary;
char rating;
public Employee(int id, String name, String dept, int salary, char rating) {
	this.id = id;
	this.name = name;
	this.dept = dept;
	this.salary = salary;
	this.rating = rating;
}

public String toString() {
	return id+" "+name+" "+dept+" "+salary+" "+rating;
}

public int compareTo(Employee e) {
	//comparing by id
	if(this.id>e.id)
		return 1;
	else if(this.id<e.id)
		return -1;
	else
		return 0;
	
	//sorting in reverse order by id
//	if(this.id>e.id)
//		return -1;
//	else if(this.id<e.id)
//		return 1;
//	else 
//		return 0;
	
	
	
	
	//comparing by name
//	return this.name.compareTo(e.name);
	
	
	//comparing by rating
//	if(this.rating>e.rating)
//		return 1;
//	else if(this.rating<e.rating)
//		return -1;
//	else 
//		return this.name.compareTo(e.name);
	
	
	//sorting using two objects
	
//	if(this.dept.compareTo(e.dept)==0) {
//		if(this.salary>e.salary)
//			return 1;
//		else if(this.salary<e.salary)
//			return -1;
//		else 
//			return 0;
//	}else {
//		return this.dept.compareTo(e.dept);
//	}
	
	
}


}
