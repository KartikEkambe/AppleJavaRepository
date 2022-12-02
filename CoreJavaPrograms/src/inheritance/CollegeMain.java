package inheritance;

public class CollegeMain {

	public static void main(String[] args) {
		
		Department d=new Department(101, "Computer");
//		d.setId(101);
//		d.setName("Computer");
		
		Library l=new Library(1000,"Bhandare");
//		l.setNoofbooks(1000);
//		l.setIncharge("Bhandare");
		
		College c=new College(313, "MDM College", "Latur", d, l);
//		c.setCode(313);
//		c.setName("MDM College");
//		c.setAddress("Latur");
//		c.setDept(d);
//		c.setLib(l);
		System.out.println(c);

	}

}
