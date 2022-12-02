package writtenPrograms04constructor;

public class Student {
	
	int id;
	String name;
	
	Student(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	Student(Student s){
		id=s.id;
		name=s.name;
	}
	
	void display() {
		System.out.println(id+" "+name);
	}

	

}
