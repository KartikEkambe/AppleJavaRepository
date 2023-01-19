 package collection;
import java.util.*;
public class StudentMain01 {
	void addStudent(ArrayList<Student01>al) {
		ArrayList<Integer>m1=new ArrayList<Integer>();
		m1.add(56);
		m1.add(67);
		m1.add(78);
		m1.add(84);
		m1.add(77);
		
		ArrayList<Integer>m2=new ArrayList<Integer>();
		m2.add(66);
		m2.add(87);
		m2.add(72);
		m2.add(87);
		m2.add(67);
		
		ArrayList<Integer>m3=new ArrayList<Integer>();
		m3.add(44);
		m3.add(33);
		m3.add(42);
		m3.add(57);
		m3.add(67);
		
		
		al.add(new Student01(108,"Vaibhav","Civil",m1));
		al.add(new Student01(78,"Pramod","Mech",m2));
		al.add(new Student01(152,"Omkar","Computer",m3));
	}
 void calculatePercentage(ArrayList<Student01>al) {
//	 double per;
//	 for(Student01 s:al) {
//		 int sum=0;
//		 for(Integer i:s.getMarks()) {
//			 sum=sum+i;
//		 }
//		  per=(sum/s.getMarks().size());
//		  System.out.println(s.name+" "+s.dept+" "+per);
//	 }
	 
	 double percent;
	 Iterator<Student01>itr=al.iterator();
	 while(itr.hasNext()) {
		
		 Student01 s=itr.next();
		 if(s.getDept().equalsIgnoreCase("computer")) {
		 Iterator<Integer> mitr=s.getMarks().iterator();
		 int sum=0;
		 while(mitr.hasNext()) {
			 sum=sum+mitr.next();
		 }
		 percent=sum/s.getMarks().size();
		 char ch=grade(percent);
		 
		 System.out.println(s.getName()+" "+s.getDept()+" "+percent+" "+ch);
	 }
	 }

	
 }
 
  char grade(double per) {
	  if(per>60)
		  return 'A';
		  else if(per>50)
			  return 'B';
		  else if(per>40)
			  return 'C';
		  else
			  return 'd';
  }


	public static void main(String[] args) {
		ArrayList<Student01>al=new ArrayList<Student01>();
		StudentMain01 s=new StudentMain01();
		s.addStudent(al);
		System.out.println(al);
		s.calculatePercentage(al);



	}

}
