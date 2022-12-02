package Encapsulation;

public class MainGS {

	public static void main(String[] args) {
		GetterSetterEx g=new GetterSetterEx();
		g.setName("Kartik");
		g.setSurname("Ekambe");
		g.setValue1(90);
		g.setValue2(96);
		
		System.out.println(g.getName()+" "+g.getSurname()+" "+g.getValue1()+" "+g.getValue2());
	}

}
