package writtenPrograms05Polymorphism;

public class Address02 {
	
	private String city;
	private String state;
	private String country;
	
	
	
	
	 Address02(String city, String state, String country) {
		
		this.city = city;
		this.state = state;
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String toString() {
		return city+" "+state+" "+country;
	}
	

}
