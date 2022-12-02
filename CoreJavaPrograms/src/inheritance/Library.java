package inheritance;

public class Library {
	
	private int noofbooks;
	private String incharge;
	
	
	
	 Library(int noofbooks, String incharge) {
		super();
		this.noofbooks = noofbooks;
		this.incharge = incharge;
	}
	public int getNoofbooks() {
		return noofbooks;
	}
	public void setNoofbooks(int noofbooks) {
		this.noofbooks = noofbooks;
	}
	public String getIncharge() {
		return incharge;
	}
	public void setIncharge(String incharge) {
		this.incharge = incharge;
	}
	
	public String toString() {
		return noofbooks+" "+incharge;
	}

}
