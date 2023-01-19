package arrayAssignment;

import java.util.Arrays;

public class Department11 {
	int did;
	String dname;
	Student11 []stud;
	 Department11(int did, String dname, Student11[] stud) {
		
		this.did = did;
		this.dname = dname;
		this.stud = stud;
	}
	 
	 public String toString() {
		 return did+" "+dname+" "+Arrays.toString(stud);
	 }
	

}
