package comparableAndComparator;

public class Car implements Comparable<Car> {
int id;
String name,brand;
int price,launchYear;
public Car(int id, String name, String brand, int price, int launchYear) {
	super();
	this.id = id;
	this.name = name;
	this.brand = brand;
	this.price = price;
	this.launchYear = launchYear;
}

public String toString() {
	return id+" "+name+" "+brand+" "+price+" "+launchYear;
			
}

public int compareTo(Car c) {
	if(this.brand.compareTo(c.brand)==0) {
		if(this.price>c.price) {
			return 1;
		}
		else if(this.price<c.price) {
			return -1;
		}
		else{
			return this.name.compareTo(c.name);
		}
	}else {
		return this.brand.compareTo(c.brand);
	}
}

}
