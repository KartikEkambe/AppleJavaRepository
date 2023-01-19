package writtenPrograms06Inheritance;

public class Father02 {
	static String lastName="Ekambe";
	String name,middleName;
	public void setName(String name) {
		this.name = name;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	void display() {
		System.out.println("Father Info : "+name+" "+middleName+" "+lastName);
	}

}
