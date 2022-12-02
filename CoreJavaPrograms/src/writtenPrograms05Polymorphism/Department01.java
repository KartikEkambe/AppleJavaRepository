package writtenPrograms05Polymorphism;

public class Department01 {
	
	int id;
	String name;
	
	Department01(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	public String toString() {
		return id+" "+name;
	}

}
