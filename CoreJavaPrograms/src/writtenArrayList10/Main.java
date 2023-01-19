package writtenArrayList10;
import java.util.*;
public class Main {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			LinkedList<Emp> a = new LinkedList<>();
			Emp e = new Emp();
			e.setId(1);
			e.setName("pramod");
			e.setDept("it");
			a.add(e);

			Emp e1 = new Emp();
			e1.setId(2);
			e1.setName("pravin");
			e1.setDept("it");
			a.add(e1);
			Emp e3 = new Emp();
			e3.setId(3);
			e3.setName("atif");
			e3.setDept("mech");
			a.add(e3);
			Emp e4 = new Emp();
			e4.setId(4);
			e4.setName("raj");
			e4.setDept("comp");
			a.add(e4);
			Emp e5 = new Emp();
			e5.setId(5);
			e5.setName("priti");
			e5.setDept("it");
			a.add(e5);
	      String s=a.get(2).getDept();  // 2 indicate the employee index number which one compare  
	     System.out.println(s);
		  for(int i=0;i<a.size();i++) {
			  if(i!=2) {     //// 2 indicate the employee index number which one compare  
			  if(a.get(i).getDept().equalsIgnoreCase(s)) {
				  a.remove(i);
		}
			  else {
				  System.out.println(a.get(i));
			  }
	}
		}
	}
	}

