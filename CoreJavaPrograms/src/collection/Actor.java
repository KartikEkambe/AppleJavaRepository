package collection;

public class Actor {
	int id ;
	String name;

	public Actor(int id,String name){
		this.id=id;
		this.name=name;
	}
	public String toString() {
		return id+" "+name;
	}
}
