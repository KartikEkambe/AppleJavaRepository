package collection;
import java.util.*;
public class LengthOfMonth {
	void showlength() {
		ArrayList<String> al=new ArrayList<String>();
		al.add("January");
		al.add("February");
		al.add("March");
		al.add("April");
		al.add("May");
		al.add("June");
		al.add("July");
		al.add("August");
		al.add("September");
		al.add("October");
		al.add("November");
		al.add("December");
		
		for(String s:al) {
			if(s.contains("e")) {
				
				System.out.println(s+" : "+s.length());
			}
		}
		
	}
	public static void main(String[] args) {
		LengthOfMonth l=new LengthOfMonth();
		l.showlength();
	}

}
