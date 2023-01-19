package comparableAndComparator;

import java.util.*;

public class MovieMain {
	
	void setData(ArrayList<Movie> movie) {
		ArrayList<Actor> k=new ArrayList<Actor>();
		k.add(new Actor(102,"Rishabh Shetty"));
		k.add(new Actor(54,"Sapthami Gowda"));
		k.add(new Actor(84,"Kishor"));

		ArrayList<Actor> b=new ArrayList<Actor>();
		b.add(new Actor(12,"Ranveer Kapoor"));
		b.add(new Actor(51,"Alia Bhatt "));
		b.add(new Actor(54,"Amitabh Bacchan"));
		
		ArrayList<Actor> v=new ArrayList<Actor>();
		v.add(new Actor(20,"Ritesh Deshmukh"));
		v.add(new Actor(54,"Genelia"));
		v.add(new Actor(88,"Jiya"));
		v.add(new Actor(64,"Salman Khan"));
		
		ArrayList<Actor> avt=new ArrayList<Actor>();
		avt.add(new Actor(333,"Sam Wartinghton"));
		avt.add(new Actor(88,"Kate Winselt "));
		avt.add(new Actor(453,"Zoe Saladana"));
		
		ArrayList<Actor> sholey=new ArrayList<Actor>();
		sholey.add(new Actor(33,"Dharmendra"));
		sholey.add(new Actor(54,"Amitabh Bacchan"));
		sholey.add(new Actor(73,"Hema Malini"));
		
		movie.add(new Movie(222,"Kantara","450 Cr",k));
		movie.add(new Movie(514,"Bramhastr","418 Cr",b));
		movie.add(new Movie(125,"Ved","45 Cr",v));
		movie.add(new Movie(546,"Avtaar","292.2 Crore USD",avt));
		movie.add(new Movie(86,"Sholey","254 Cr",sholey));

		
	}
	
	

	public static void main(String[] args) {
		ArrayList<Movie> movie=new ArrayList<>();
		
		MovieMain m=new MovieMain();
		m.setData(movie);
		System.out.println(movie);
		Collections.sort(movie);
//		System.out.println(movie);

		
		for(Movie mm:movie) {
			Collections.sort(mm.act,new ActorNameComparator());
			System.out.println(mm);
		}


	}

}
