package staticpack;

import java.util.Scanner;

public class PuneCollege {
	int id,dno,studno;
	String name,location;
	static String uniname="Pune University";
	static String state="Maharashtra";
	
	PuneCollege(int id,String name,int dno,int studno,String location){
		this.id=id;
		this.name=name;
		this.dno=dno;
		this.studno=studno;
		this.location=location;
	}
	
	public String toString() {
		return id+" "+name+" "+dno+" "+studno+" "+location+" "+uniname+" "+state;
	}
	
	
	public static void main(String[] args) {
		
//		System.out.println(PuneCollege.uniname);
//		System.out.println(PuneCollege.state);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			int sid,sdno,sstudno;
			String sname,loc;	
			System.out.println("Enter  student Id, Name ,Number of department ,Number of students , Location");
			sid=sc.nextInt();
			sname=sc.next();
			sdno=sc.nextInt();
			sstudno=sc.nextInt();
			loc=sc.next();
			
			PuneCollege c1=new PuneCollege(sid, sname, sdno, sstudno, loc);
			System.out.println(c1);
			
		}
		
		
		
	}
	

}
