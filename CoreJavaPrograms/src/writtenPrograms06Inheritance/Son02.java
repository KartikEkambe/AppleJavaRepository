package writtenPrograms06Inheritance;

public class Son02 extends Father02{
	
	String sname;

	public void setSname(String sname) {
		this.sname = sname;
	}
	
	void display() {
		super.display();
		
		System.out.println("Son Info : "+sname+" "+super.name+" "+Son02.lastName);
	}

}
