package inheritance.singleInheritance;

public class DateTimeMain {

	public static void main(String[] args) {
		
		MyTime mt=new MyTime();
		mt.setDd(28);
		mt.setMm(11);
		mt.setYy(2022);
		mt.setHrs(11);
		mt.setMins(33);
		mt.setSecs(39);
		
		mt.displayDateTime();
		

	}

}
