package inheritance;

public class IdProof01 {
	private int number;
	private String name;
	private String address;

	public IdProof01(int number, String name, String address) {
		this.number = number;
		this.name = name;
		this.address = address;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
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

	public String toString() {
		return number + " " + name + " " + address;
	}

}
