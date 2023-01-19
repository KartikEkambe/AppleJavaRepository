package comparableAndComparator;

import java.util.ArrayList;

public class Movie implements Comparable<Movie> {
int id;
String name,boxOfficeCollection;


ArrayList<Actor>act;
public Movie(int id, String name, String boxOfficeCollection, ArrayList<Actor> act) {
	this.id = id;
	this.name = name;
	this.boxOfficeCollection = boxOfficeCollection;
	this.act = act;
}

public String toString() {
	return id+" "+name+" "+boxOfficeCollection+" "+act+"\n";
}

public int compareTo(Movie m) {
	return this.name.compareTo(m.name);
}

}
