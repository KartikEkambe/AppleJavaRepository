package collection;

import java.util.*;

public class CarMain {
	void addCar(ArrayList<Car> al) {
		al.add(new Car(101, "Maruti Suzuki Esteem", 1993, 650000, "MarutiSuziki"));
		al.add(new Car(102, "Ford Escort", 1990, 750000, "Ford"));
		al.add(new Car(103, "Tata Sumo", 1994, 650000, "Tata"));
		al.add(new Car(104, "Hyundai Acent", 1990, 770000, "Hyundai"));
		al.add(new Car(105, "Musttang", 1995, 117000, "Ford"));
	}

	void deleteCar(ArrayList<Car> al) {
//		for (int i = 0; i < al.size(); i++) {
//			if (al.get(i).getLyear() == 1990) {
//				al.remove(i);
//			}
//		}
		
		Iterator<Car> itr=al.iterator();
		while(itr.hasNext()) {
			if(itr.next().getLyear()==1990)
				itr.remove();
		}
		
	}

	public static void main(String[] args) {
		ArrayList<Car> al = new ArrayList<>();
		CarMain c = new CarMain();
		c.addCar(al);
		System.out.println(al);
		c.deleteCar(al);

		System.out.println(al);

	}

}
