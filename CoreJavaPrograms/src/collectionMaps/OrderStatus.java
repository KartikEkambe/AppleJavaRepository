package collectionMaps;

public class OrderStatus {
String deliveryDate, status;
public OrderStatus(String deliveryDate,String status) {
	this.deliveryDate=deliveryDate;
	this.status=status;
}

public String toString() {
	return deliveryDate+" "+status;
}
}
