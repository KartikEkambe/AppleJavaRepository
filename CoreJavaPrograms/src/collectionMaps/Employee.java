package collectionMaps;

public class Employee {
int id;
String name,dept;
int salary;

public Employee() {}
public Employee(int id,String name,String dept,int salary) {
	this.id=id;
	this.name=name;
	this.dept=dept;
	this.salary=salary;
}

public String toString() {
	return id+" "+name+" "+dept+" "+salary;
}

}
