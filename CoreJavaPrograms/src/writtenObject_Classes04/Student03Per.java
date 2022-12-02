package writtenObject_Classes04;

import java.util.Scanner;

public class Student03Per {
	
	float calculate(int eng,int math,int sci) {
		float percentage=(eng+math+sci)/3;
		return percentage;
	}
	
	void display(float percentage) {
		
	    if(percentage>=85) {
	    	System.out.println(" Percentage is : "+percentage+" %");
	    	System.out.println(" Student passed First Class");
	    }
	    else if(percentage<85 && percentage>=65) {
	    	System.out.println(" Percentage is : "+percentage+" %");
	    	System.out.println(" Student passed Second Class");	   
	    	}
	    else if(percentage<65 && percentage >=35) {
	    	System.out.println(" Percentage is : "+percentage+" %");
	    	System.out.println(" Student passed third Class");	   
	    }
	    else {
	    	System.out.println(" Percentage is : "+percentage+" %");

	    	System.out.println(" Failed !!!");
	    }
	    
	    


	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int e,m,s;
		System.out.println("Enter the marks of english , math, science");
		e=sc.nextInt();
		m=sc.nextInt();
		s=sc.nextInt();
	
		Student03Per std=new Student03Per();
		float per=std.calculate(e, m, s);
		std.display(per);


	}

}
