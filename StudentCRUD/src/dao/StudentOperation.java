package dao;

import java.util.Arrays;
import java.util.Scanner;

import pojo.Student;

public class StudentOperation {
	Student stud[] = new Student[6];

	Scanner sc = new Scanner(System.in);

	public void insertData() {
		int m1[] = { 45, 55, 75, 85, 66 };
		int m2[] = { 44, 65, 86, 55, 76 };
		int m3[] = { 56, 85, 66, 78, 88 };

		Student s1 = new Student();
		s1.setId(101);
		s1.setName("Sumit");
		s1.setEmail("sumit@gmail.com");
		s1.setContact("8080235510");
		s1.setDept("Commerce");
		s1.setMarks(m1);
		stud[0] = s1;

		Student s2 = new Student();
		s2.setId(102);
		s2.setName("Amit");
		s2.setEmail("amit@gmail.com");
		s2.setContact("7080235510");
		s2.setDept("Art");
		s2.setMarks(m2);
		stud[1] = s2;

		Student s3 = new Student();
		s3.setId(103);
		s3.setName("Kiran");
		s3.setEmail("kiran@gmail.com");
		s3.setContact("7218096465");
		s3.setDept("Science");
		s3.setMarks(m3);

		stud[2] = s3;

	}

	public void userInput() {
		System.out.println("Student Add Method ");
		System.out.println("Enter student id,name,email,contact , department and 5 subject marks");
		int sid = sc.nextInt();
		String sname = sc.next();
		String email = sc.next();
		String contact = sc.next();
		String dept = sc.next();

		int m[] = new int[5];
//		System.out.println("Enter marathi,hindi,english,mathematics and science marks");
		for (int i = 0; i < m.length; i++) {
			m[i] = sc.nextInt();

		}

		Student s = new Student();
		s.setId(sid);
		s.setName(sname);
		s.setEmail(email);
		s.setContact(contact);
		s.setDept(dept);
		s.setMarks(m);
		for (int i = 0; i < stud.length; i++) {
			if (stud[i] == null) {
				stud[i] = s;
				break;
			}
		}

		System.out.println();
	}

	public void displayAllStudent() {
		System.out.println("Display Method ");
//		System.out.println(Arrays.toString(stud));
		for (Student s : stud) {
			if (s != null) {

				System.out.println(s.getId() + " " + s.getName() + " " + s.getEmail() + " " + s.getContact() + " "
						+ s.getDept() + " " + Arrays.toString(s.getMarks()));

			}
		}
		System.out.println();
	}

	public void updateStudent() {
		System.out.println("Update Method ");
		System.out.println("Enter student id to update detail");
		int id = sc.nextInt();

		System.out.println(" 1. Update Contact \n 2. Update Email ");
		System.out.println("Enter your choice");
		int ch = sc.nextInt();

		switch (ch) {
		case 1:
			for (Student s : stud) {
				if (s != null) {
					if (id == s.getId()) {
						System.out.println("Enter contact to update ");
						String contact = sc.next();
						s.setContact(contact);

					}

				}
			}

			break;

		case 2:
			for (Student s : stud) {
				if (s != null) {
					if (id == s.getId()) {
						System.out.println("Enter email to update ");
						String email = sc.next();
						s.setEmail(email);

					}

				}
			}
			break;

		default:
			System.out.println("Enter valid input");

		}

		for (Student s : stud) {
			if (s != null) {

				System.out.println(s.getId() + " " + s.getName() + " " + s.getEmail() + " " + s.getContact() + " "
						+ s.getDept() + " " + Arrays.toString(s.getMarks()));

			}
		}
		System.out.println();

	}

	public void deleteStudent() {
		System.out.println("Delete Method ");
		System.out.println("Enter student id to delete data");
		int id = sc.nextInt();

		int index = 0;
		for (int i = 0; i < stud.length; i++) {
			if (stud[i] != null) {
				if (id == stud[i].getId()) {
					index = i;
				}
			}
		}

		Student temp[] = new Student[stud.length];
		int j = 0;
		for (int i = 0; i < stud.length; i++) {
			if (i == index) {
				continue;
			} else {
				temp[j] = stud[i];
				j++;
			}
		}

		for (int i = 0; i < temp.length; i++) {
			stud[i] = temp[i];
		}

		for (Student s : stud) {
			if (s != null) {

				System.out.println(s.getId() + " " + s.getName() + " " + s.getEmail() + " " + s.getContact() + " "
						+ s.getDept() + " " + Arrays.toString(s.getMarks()));

			}
		}

		System.out.println();

	}

	public void searchStudentById() {
		System.out.println("Search Method ");
		System.out.println("Enter student id to get student data");
		int id = sc.nextInt();

		for (Student s : stud) {
			if (s != null) {
				if (id == s.getId()) {
					System.out.println(s.getId() + " " + s.getName() + " " + s.getEmail() + " " + s.getContact() + " "
							+ s.getDept() + " " + Arrays.toString(s.getMarks()));
				}
			}
		}
		System.out.println();
	}

}
