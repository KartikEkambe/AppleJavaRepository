package collection;

public class Car {
	int id;
	String name;
	int lyear;
	int price;
	String brandName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLyear() {
		return lyear;
	}
	public void setLyear(int lyear) {
		this.lyear = lyear;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public Car(int id, String name, int lyear, int price, String brandName) {
		super();
		this.id = id;
		this.name = name;
		this.lyear = lyear;
		this.price = price;
		this.brandName = brandName;
	}
	
	public String toString() {
		return id+" "+name+" "+lyear+" "+price+" "+brandName;
	}

}
