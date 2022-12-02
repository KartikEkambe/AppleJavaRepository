package inheritance;

public class Engine {
	
	int cylinder;
	String company,rpm,torque;
	
	
	
	public Engine (String company, String rpm,int cylinder, String torque) {
		super();
		this.cylinder = cylinder;
		this.company = company;
		this.rpm = rpm;
		this.torque = torque;
	}
	
	public int getCylinder() {
		return cylinder;
	}
	public void setCylinder(int cylinder) {
		this.cylinder = cylinder;
	}
	public String getTorque() {
		return torque;
	}
	public void setTorque(String torque) {
		this.torque = torque;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getRpm() {
		return rpm;
	}
	public void setRpm(String rpm) {
		this.rpm = rpm;
	}
	
	
	public String toString() {
		return company+" "+rpm+" "+cylinder+" "+torque;
	}

}
