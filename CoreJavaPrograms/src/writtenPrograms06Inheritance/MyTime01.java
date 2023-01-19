package writtenPrograms06Inheritance;

public class MyTime01 extends MyDate01 {
	
	int  hrs,mins,secs;

	public void setHrs(int hrs) {
		this.hrs = hrs;
	}

	public void setMins(int mins) {
		this.mins = mins;
	}

	public void setSecs(int secs) {
		this.secs = secs;
	}
	
	void display() {
		System.out.println(hrs +" "+mins+" "+secs);
		System.out.println(dd+" "+mm+" "+yy);
	}

}
