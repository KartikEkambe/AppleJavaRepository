package abstraction;

public class LaptopMain {

	public static void main(String[] args) {
		
		DellRyzen d=new DellRyzen();
		d.setPrice(49999);
		d.setColor("Matt Black");
		d.setWeight("1.65Kg");
		d.processor();
		
		d.semiConductor();
		d.rating();
		d.electricityConsumption();
		d.features();
		System.out.println(d.getPrice()+" "+d.getColor()+" "+d.getWeight());



	}

}
