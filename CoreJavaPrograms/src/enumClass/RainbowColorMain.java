package enumClass;

public class RainbowColorMain {

	public static void main(String[] args) {
		//one enum cannot extend another enum
		
		//one enum cannot another enum.enum can be declared inside the class as well as outside the class.when we declare enum inside it can be constants
		//enum is always final so it cannot be extende another enum and class but enum can implement interface
		//constant declared always public static and final
		//constructor allowed in enum but it can be only private
		
		
		RainbowColorsEnum rc1=RainbowColorsEnum.RED;
		System.out.println(rc1.ordinal());//ordinal() show the position in the list of constants
		
		RainbowColorsEnum rce[]=RainbowColorsEnum.values();
		for(RainbowColorsEnum rc:rce) {
			System.out.println(rc.ordinal()+" "+rc);
			rc.display();
		}
	}
}
