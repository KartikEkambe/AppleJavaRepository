package inheritance;

public class Car {

	int price;
	String name,color;
	Engine e;
	
	Car(String name,int price,String color,Engine e){
		this.name=name;
		this.price=price;
		this.color=color;
		this.e=e;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Engine getE() {
		return e;
	}
	public void setE(Engine e) {
		this.e = e;
	}
	
	public String toString() {
		return "Car Details :"+ name+" "+price+" "+color+"\nEngine Details : "+e;
	}
	
}
