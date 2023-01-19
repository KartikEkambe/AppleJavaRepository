package collectionMaps;

public class Order {
	int id,totalCost;
	String city;
	OrderStatus ordst;
	public Order(int id, int totalCost, String city, OrderStatus ordst) {
		this.id = id;
		this.totalCost = totalCost;
		this.city = city;
		this.ordst = ordst;
	}
	
	public String toString() {
		return id+" "+totalCost+" "+city+" "+ordst;
	}

}
