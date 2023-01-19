package pojo;

import java.util.Arrays;

public class Student {
	private int id;
	private String name,email,contact,dept;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private int marks[];
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	
//	public String toString() {
//		return id+" "+name+" "+email+" "+contact+" "+dept+" "+Arrays.toString(marks);
//	}

}
