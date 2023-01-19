package collection;
import java.util.*;
public class ArrayListEx {
	void average() {
		ArrayList<Float> al=new ArrayList<Float>();
		al.add(12.5f);
		al.add(8.6f);
		al.add(17.8f);
		al.add(45.9f);
		al.add(32.5f);
		al.add(28.6f);
		al.add(37.8f);
		al.add(15.9f);
		Float add=0.0f;
		for(Float f:al) {
			add=add+f;
		}
		
		Float avg=add/al.size();
		
		System.out.println("Average : "+avg);
		System.out.println();

	}

	void searchMethod() {
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("peek");
		al.add("seek");
		al.add("Beak");
		al.add("Tree");
		al.add("Peak");
		al.add("been");
		
		for(String s:al) {
			if(s.contains("ee"))
				System.out.println(s);
		}
		System.out.println();
		
	}
	
	void displayFrequency() {
		ArrayList<Character> al=new ArrayList<Character>();
		al.add('a');
		al.add('b');
		al.add('c');
		al.add('d');
		al.add('a');
		al.add('g');
		al.add('c');
		al.add('d');
		al.add('e');
		al.add('b');
		al.add('f');
		al.add('d');
		al.add('a');
		al.add('x');
		al.add('y');
		al.add('d');
		
		System.out.println(al);
		
		for(int i=0;i<al.size();i++) {
			int cnt=1;
			
			for(int j=i+1;j<al.size();j++) {
				if(al.get(i)==al.get(j)) {
					cnt++;
					al.set(j, '0');
				}
		}
			if(al.get(i)!='0') {
				System.out.println(al.get(i)+" "+cnt);
			}

	}
		System.out.println();
	}
	
	void setZ() {
		ArrayList<Character> al=new ArrayList<Character>();
		al.add('a');
		al.add('b');
		al.add('c');
		al.add('d');
		al.add('a');
		al.add('g');
		al.add('c');
		al.add('d');
		al.add('e');
		al.add('b');
		al.add('f');
		al.add('d');
		al.add('a');
		al.add('x');
		al.add('y');
		al.add('d');
		System.out.println(al);
		for(int i=0;i<al.size();i++) {
			if(al.get(i)=='a') {
				al.add(i+1, 'z');
			}
		}
		System.out.println(al);
	}
	
	
	
	
	
	public static void main(String[] args) {
		ArrayListEx a=new ArrayListEx();
		a.average();
		
		a.searchMethod();
		a.displayFrequency();
		a.setZ();
	}

}
