package constructor;

import java.util.Scanner;

public class Movie {
	int id,releaseyear;
	String name,producer,budget;
	
	Movie(int id,String name,int releaseyear,String producer,String budget) {
		this.id=id;
		this.name=name;
		this.releaseyear=releaseyear;
		this.producer=producer;
		this.budget=budget;
	}
	
	public String toString() {
		
		return id+" "+name+" "+releaseyear+" "+producer+" "+budget;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int id,release;
		String name,producer,budget;
		System.out.println("Enter the ID of movie");
		id=sc.nextInt();
		System.out.println("Enter the movie Name");
		name=sc.next();
		System.out.println("Enter the Delease Year of movie");
		release=sc.nextInt();
		System.out.println("Enter the Producer Name of movie");
		producer=sc.nextLine();
		System.out.println("Enter the Budget of movie");
		budget=sc.next();
		
		Movie m=new Movie(id, name, release, producer, budget);
		
		System.out.println(m);
		
		
		
	}
	

}
