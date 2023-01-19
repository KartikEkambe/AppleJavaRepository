package collection;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
public class FailFastAndSafeExample {
	void failFast() {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(100);
		al.add(208);
		al.add(34);
		al.add(444);
		
		Iterator<Integer>itr=al.iterator();
		while(itr.hasNext()) {
			if(itr.next()==10)
			al.add(20);
		}
		
		
	}
	void failSafe() {
		CopyOnWriteArrayList<Integer> cal=new CopyOnWriteArrayList<>();
		cal.add(20);
		cal.add(30);
		cal.add(40);
		cal.add(100);
		cal.add(208);
		cal.add(34);
		cal.add(444);
		cal.add(20);
		
		System.out.println(cal);
		
		Iterator<Integer>itr=cal.iterator();
		while(itr.hasNext()) {
			if(itr.next()==20)
				cal.add(200);
		}
		System.out.println(cal);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FailFastAndSafeExample f=new FailFastAndSafeExample();
//		f.failFast();
		f.failSafe();
	}

}
