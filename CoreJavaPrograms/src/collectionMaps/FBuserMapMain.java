package collectionMaps;
import java.util.*;
public class FBuserMapMain {
	void setData(HashMap<FBuser,Integer> hm) {
		hm.put(new FBuser(101,"Vaibhav","vaibhav@gmail.com","Male","vaibhav","7384789866"), 23);
		hm.put(new FBuser(12,"Anil","anil@gmail.com","Male","anil","8974789866"), 26);
		hm.put(new FBuser(89,"Kanchan","kanchan@gmail.com","Female","kanchan","8978986690"), 24);
		hm.put(new FBuser(11,"Audu","audu@gmail.com","Male","audumber","909690006"), 22);
		hm.put(new FBuser(1022,"Kartik","kartik@gmail.com","Male","kartik","9096407047"), 23);
		hm.put(new FBuser(123,"Bhagyashree","bhagya@gmail.com","Female","bhagyashree","8888293184"), 25);
		hm.put(new FBuser(235,"Pravin","pravin@gmail.com","Male","pravin","7385631248"), 23);
		hm.put(new FBuser(654,"Sanu","sanu@gmail.com","Female","sanu","7384789000"), 19);

	}

	void display(HashMap<FBuser,Integer> hm) {
		for(Map.Entry<FBuser, Integer> ent:hm.entrySet()) {
			System.out.print(ent.getKey()+" "+ent.getValue()+", ");
		}
	}
	
	public static void main(String[] args) {
		HashMap<FBuser,Integer> hm=new HashMap<>();
		FBuserMapMain o=new FBuserMapMain();
		o.setData(hm);
		o.display(hm);
		hm.put(new FBuser(654,"Sanvi","sanu@gmail.com","Female","sanu","7384789000"), 23);
		System.out.println();
		o.display(hm);

		
		

	}

}
