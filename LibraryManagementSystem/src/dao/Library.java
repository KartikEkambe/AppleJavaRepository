package dao;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

import pojo.Book;
import pojo.Student;
import pojo.Transaction;

public class Library {
	Scanner sc = new Scanner(System.in);

	Book[] book = new Book[5];

	public Library() {
		book[0] = new Book(1001, 3, "ShyamchiAai", "Sane Guruji");
		book[1] = new Book(1002, 2, "UnhappyIndia", "Lala Lajpat Rai");
		book[2] = new Book(1003, 5, "MyExperimentswithTruth", "Mahatma Gandhi");
		book[3] = new Book(1004, 4, "LivingAtTheState", "Swami Vivekananda");
		book[4] = new Book(1005, 7, "Geethanjali", "Rabindranath Tagore");

	}

	Student stud[] = new Student[2];
	Transaction trans[] = new Transaction[10];
	boolean bookAvailable = true;

	public void viewBook() {
		for (Book b : book) {
			if(b!=null)
			System.out.println(b);
		}
		for (Transaction t : trans) {
			if(t!=null)
			System.out.println(t);
		}
	}

	public void issueBook() {
		Student s1 = new Student();
		Book b = new Book();
		System.out.println("Enter student details : sid,name,email,contact,dept");
		int id = sc.nextInt();
		String name = sc.next();
		String email = sc.next();
		String con = sc.next();
		String dept = sc.next();
		s1.setId(id);
		s1.setSname(name);
		s1.setEmail(email);
		s1.setContact(con);
		s1.setDept(dept);

		for (int i = 0; i < stud.length; i++) {
			if (stud[i] == null) {
				stud[i] = s1;
				break;
			}
		}

		Transaction t1 = new Transaction();
		System.out.println("Enter book Name: ");
		String bookName = sc.next();

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
		Calendar c1 = Calendar.getInstance();
		String issueDate = sdf.format(c1.getTime());
		c1.add(Calendar.DATE, 30);
		String returnDate = sdf.format(c1.getTime());
		t1.setS(s1);
		t1.setBookName(bookName);
		t1.setIssueDate(issueDate);
		t1.setReturnDate(returnDate);
		for (Book x : book) {
			if (x != null) {
				if (x.getName().equalsIgnoreCase(bookName) && x.getCopyNo() == 0) {
					System.out.println("Book not available");
					bookAvailable = false;
					break;
				}
			}
		}

		for (int i = 0; i < trans.length; i++) {
			if (trans[i] != null) {
				trans[i] = t1;
				t1.setBookIssue(true);
				break;
			}
		}

		for (Book x : book) {
			if (x != null) {
				if (x.getName().equalsIgnoreCase(bookName)) {
					if (bookAvailable == true && x.getCopyNo() > 0) {
						int count = x.getCopyNo();
						x.setCopyNo(count - 1);
					}
				}
			}
		}

	}

	public void returnBook() {
		System.out.println("Enter bookName :");
		String bookName = sc.next();

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
		Calendar c1 = Calendar.getInstance();
		String returnDate = sdf.format(c1.getTime());

		for (Transaction t : trans) {
			if (t != null) {
				if (t.getBookName().equalsIgnoreCase(bookName)) {
					t.setReturnDate(returnDate);
					t.setBookIssue(false);
					System.out.println("Book Name:" + t.getBookName() + " Issued on" + t.getIssueDate()
							+ " returned by " + t.getS().getSname() + " on date " + t.getReturnDate());
				}

			}
		}

		for (Book b : book) {
			if (b != null) {
				if (b.getName().equalsIgnoreCase(bookName)) {
					int count = b.getCopyNo();
					b.setCopyNo(count + 1);
				}
			}
		}
	}

	public void availabilityBook() {
		System.out.println("Enter book name : ");
		String bookName = sc.next();
		for (Book b : book) {
			if (b != null) {
				if (b.getName().equalsIgnoreCase(bookName)) {
					if (b.getCopyNo() == 0) {
						System.out.println(b.getName() + " is not available");
					} else {
						System.out.println("Available copies of" + b.getName() + ":" + b.getCopyNo());
					}
				}
			}
		}

	}

	public void bookIssueDetails() {
		System.out.println("Enter book name");
		String bookName = sc.next();
		for (Transaction t : trans) {
			if (t != null) {
				if (t.getBookName().equalsIgnoreCase(bookName)) {
					if (t.isBookIssue() == true) {
						System.out.println(
								t.getBookName() + " issued to " + t.getS().getSname() + " on date " + t.getIssueDate());

						System.out.println("Book not returned expected return date till :" + t.getReturnDate());
					} else {
						System.out.println(t.getBookName() + " returned by " + t.getS().getSname() + " on date "
								+ t.getReturnDate());
					}
				}
			}
		}
	}

}
