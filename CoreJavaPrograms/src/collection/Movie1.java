package collection;

public class Movie1 {
	int id;
	String name;
	int noOfShows;
	public Movie1() {}
	public Movie1(int id,String name,int noOfShows) {
		this.id=id;
		this.name=name;
		this.noOfShows=noOfShows;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoOfShows() {
		return noOfShows;
	}
	public void setNoOfShows(int noOfShows) {
		this.noOfShows = noOfShows;
	}

	public String toString() {
		return id+" "+name+" "+noOfShows;
	}
	
}
