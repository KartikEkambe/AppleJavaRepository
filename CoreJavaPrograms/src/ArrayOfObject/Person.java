package ArrayOfObject;

public class Person {
	private int id;
	private String name;
	private String address;
	IDProof idProof[];
	
	Person(){
		
	}
	
	 Person(int id, String name, String address, IDProof[] idProof) {
	
		this.id = id;
		this.name = name;
		this.address = address;
		this.idProof = idProof;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public IDProof[] getIdProof() {
		return idProof;
	}
	public void setIdProof(IDProof[] idProof) {
		this.idProof = idProof;
	}

}
