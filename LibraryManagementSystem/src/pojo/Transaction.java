package pojo;

public class Transaction {

	Student s;
	String bookName;
	String issueDate,returnDate;
	boolean bookIssue;
	public boolean isBookIssue() {
		return bookIssue;
	}
	public void setBookIssue(boolean bookIssue) {
		this.bookIssue = bookIssue;
	}
	public Student getS() {
		return s;
	}
	public void setS(Student s) {
		this.s = s;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	public String getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}
	
	
}
