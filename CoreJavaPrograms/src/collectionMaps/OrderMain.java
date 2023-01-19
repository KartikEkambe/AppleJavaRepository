package collectionMaps;
import java.util.*;
public class OrderMain {
	void addOrder(ArrayList<Order>al) {
		al.add(new Order(245,2999,"Pune",new OrderStatus("16-01-2023","deliverd")));
		al.add(new Order(65,12499,"Nasik",new OrderStatus("19-01-2023","pending")));
		al.add(new Order(245,2999,"Nagpur",new OrderStatus("24-01-2023","pending")));
		al.add(new Order(245,2999,"Pune",new OrderStatus("15-01-2023","deliverd")));
		al.add(new Order(245,2999,"Ahmadnagar",new OrderStatus("14-01-2023","deliverd")));
		al.add(new Order(245,2999,"Solapur",new OrderStatus("18-01-2023","pending")));
		al.add(new Order(245,2999,"Mumbai",new OrderStatus("17-01-2023","pending")));

	}
	
	void createMap(ArrayList<Order>al,HashMap<String,Integer>hm) {
		for(Order o:al) {
			String stat=o.ordst.status;
			if(hm.containsKey(stat)) {
				hm.put(stat, hm.get(stat)+1);
			}else {
				hm.put(stat, 1);
			}
		}
	}
	
	void display(HashMap<String,Integer>hm) {
		for(Map.Entry<String, Integer>ent:hm.entrySet()) {
			System.out.println(ent.getKey()+" "+ent.getValue());
		}
	}
	

	public static void main(String[] args) {
		ArrayList<Order>al=new ArrayList<Order>();
		OrderMain o=new OrderMain();
		o.addOrder(al);
		HashMap<String,Integer>hm=new HashMap<String, Integer>();
		o.createMap(al, hm);
		o.display(hm);
	}

}
