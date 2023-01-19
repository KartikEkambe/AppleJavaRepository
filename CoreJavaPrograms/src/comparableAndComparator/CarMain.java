package comparableAndComparator;

import java.util.*;

public class CarMain {
	void setData(ArrayList<Car> c) {
		c.add(new Car(122, "Baleno", "Maruti", 850000, 2018));
		c.add(new Car(342, "Swift", "Maruti", 950000, 2020));
		c.add(new Car(1022, "Audi Q8", "Audi", 10050000, 2022));
		c.add(new Car(542, "HondaCity", "Honda", 1850000, 2020));
		c.add(new Car(1012, "MustTang", "Ford", 3500000, 2022));
		c.add(new Car(892, "Cresta", "Hyundai", 1500000, 2022));
		c.add(new Car(562, "Fortuner Legender", "Toyota", 4282000, 2022));
		c.add(new Car(782, "Everest", "Ford", 3500000, 2021));
		c.add(new Car(689, "Vellfire", "Toyota", 4282000, 2022));




	}

	public static void main(String[] args) {
		ArrayList<Car> cal = new ArrayList<Car>();
		CarMain c=new CarMain();
		c.setData(cal);
		System.out.println(cal);
		Collections.sort(cal);
		System.out.println();
		System.out.println(cal);
	}

}
