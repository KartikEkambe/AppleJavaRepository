package ArrayOfObject;

public class Movie {
	 int id;
	 String name;
	  int releaseYear;

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

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	
	Movie(){
		
	}

	Movie(int id, String name, int releaseYear) {
		
		this.id = id;
		this.name = name;
		this.releaseYear = releaseYear;
	}
	
	public String toString() {
		return id+" "+name+" "+releaseYear;
	}

}
