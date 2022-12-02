package inheritance;

public class CarMain {

	public static void main(String[] args) {
		
		Engine e=new Engine("Tata", "1000rmp", 4, "89Nm");
		
		Car c=new Car("Nexon", 1800000, "Black Red", e);
		System.out.println(c);
		
		
		
//		String name="Tata";
//		String rpm="1000RPM";
//		int cylinder=4;
//		String torque="89 Nm";
//		Engine e = new Engine(name, rpm, cylinder, torque);
//		e.setCompany(name);
//		e.setRpm(rpm);
//		e.setCylinder(cylinder);
//		e.setTorque(torque);
//
//		String cname="Nexon";
//		int price=1500000;
//		String color="Black Red";
//		
//		
//		Car c = new Car(cname, price, color, e);
//		c.setName(cname);
//		c.setPrice(price);
//		c.setColor(color);
//		c.setE(e);
//
//		System.out.println("Information of car is : ");
//		System.out.println("Name : " + c.getColor() + "\nPrice : " + c.getPrice() + "\nColor : " + c.getColor());
//		System.out.println("Engine : "+c.getE().company+" "+c.getE().rpm+" "+c.getE().cylinder+"cylinder "+c.getE().torque);
//		System.out.println("Engine : "+c.getE());

	}

}
