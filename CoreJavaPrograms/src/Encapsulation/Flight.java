package Encapsulation;

public class Flight {
	private int id;
	private String company,source,destination;
	private char flightclass;
	
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	
	public void setCompany(String company) {
		this.company=company;
	}
	
	public String getCompany() {
		return company;
	}
	
	public void setSource(String source) {
		this.source=source;
	}
	
	public String getSource() {
		return source;
	}
	
	public void setDestination(String destination) {
		this.destination=destination;
	}
	
	public String getDestination() {
		return destination;
	}
	
	public void setFlightclass(char flightclass) {
		this.flightclass=flightclass;
	}
	
	public char getFlightclass() {
		return flightclass;
	}
	
	
	
	
	

}
