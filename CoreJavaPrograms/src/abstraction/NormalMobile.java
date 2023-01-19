package abstraction;

public class NormalMobile implements Mobile {

	public void calling(String call) {
		System.out.println("dial a number for calling " + call);
	}

	public void messaging(String msg) {
		System.out.println("we can send messages using normal mobile" + msg);
	}

	public void fm(String fm) {
		System.out.println("We can listne music using fm" + fm);
	}

	public void calculator() {
		System.out.println("all mobile have calculator for calculation");
	}

	public void calender() {
		System.out.println("All mobile have calender ");
	}

	public void ram(String ram) {
		System.out.println("Normal mobile ram is " + ram);
	}

	public void battery(String battery) {
		System.out.println("Batter of normal mobile is : " + battery);
	}

	
}
