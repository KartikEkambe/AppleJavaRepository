package abstraction;

public abstract class Laptop {
	int price;
	String color,weight;

		public int getPrice() {
		return price;
	}
	public void setPrice(int price ) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
		
		
		
		void processor() {
			System.out.println("AMD Ryzen");
		}
		void semiConductor() {
			System.out.println("Silicon");
		}
		
		abstract void rating();
		abstract void electricityConsumption();
		abstract void features();

	

}
