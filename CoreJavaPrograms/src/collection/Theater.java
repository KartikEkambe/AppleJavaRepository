package collection;
import java.util.*;
public class Theater {
	int id;
	String name;
	ArrayList<Movie1>movie;
public Theater() {};
public Theater(int id,String name,ArrayList<Movie1>movie) {
	this.id=id;
	this.name=name;
	this.movie=movie;
}
public String toString() {
	return id+" "+name+" "+movie;
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
public ArrayList<Movie1> getMovie() {
	return movie;
}
public void setMovie(ArrayList<Movie1> movie) {
	this.movie = movie;
}

}
