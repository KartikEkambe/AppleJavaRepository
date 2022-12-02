package inheritance;

public class College {

	private int code;
	private String name;
	private String address;
	Department dept;
	Library lib;

	College(int code,String name,String address,Department dept,Library lib)
	{
		this.code=code;
		this.name=name;
		this.address=address;
		this.dept=dept;
		this.lib=lib;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public Department getDept() {
		return dept;
	}

	public void setLib(Library lib) {
		this.lib = lib;
	}

	public Library getLib() {
		return lib;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
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
		return "College info : " + code + " " + name + " " + address + "\nDepartment info : " + dept
				+ "\nLibrary info : " + lib;
	}

}
