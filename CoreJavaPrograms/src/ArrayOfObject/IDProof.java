package ArrayOfObject;

public class IDProof {
	private String name;
	private int validity;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValidity() {
		return validity;
	}

	public void setValidity(int validity) {
		this.validity = validity;
	}

	IDProof(){}
	IDProof(String name, int validity) {

		this.name = name;
		this.validity = validity;
	}

}
