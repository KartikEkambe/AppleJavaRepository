package writtenPrograms06Inheritance;

public class LaptopMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop l=new Laptop();
		l.setNoOfUSBPort(2);
		l.setProcessorSpeed(3);
		
		System.out.println("Number of USB Port is : "+l.getNoOfUSBPort()+" Ports \nProcessor Speed is : "+l.getProcessorSpeed()+" GHz");

	}

}
