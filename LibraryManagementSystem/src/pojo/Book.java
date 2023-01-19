package pojo;

public class Book {
	
	private int id,copyNo;
	private String name,author;
	public Book(){
		
	}
	public Book(int id, int copyNo, String name, String author) {
		super();
		this.id = id;
		this.copyNo = copyNo;
		this.name = name;
		this.author = author;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCopyNo() {
		return copyNo;
	}
	public void setCopyNo(int copyNo) {
		this.copyNo = copyNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	public String toString() {
	return id+", "+name+", "+author+" - "+copyNo;	
	}
}
