package inheritance;

public class Driver {
	private int did;
	private String dname;
	private String contact;
	
	
	
	public Driver(int did, String dname, String contact) {
		super();
		this.did = did;
		this.dname = dname;
		this.contact = contact;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	public String toString() {
		return "Driver [did=" + did + ", dname=" + dname + ", contact=" + contact + "]";
	}
	

	
}
