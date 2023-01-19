package collectionMaps;

public class FBuser {
	int id;
	String name,email,gender,password,contact;
	public FBuser(int id, String name, String email, String gender, String password, String contact) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.password = password;
		this.contact = contact;
	}
	
	public String toString() {
		return id+" "+name+" "+email+" "+gender+" "+password+" "+contact;
	}
	
	public int hashCode() {
		return id;
	}

	public boolean equals(Object o) {
		FBuser f=(FBuser) o;
		if(this.id==f.id) {
			f.name=this.name;
			return true;
		}
		else
			return false;
	}
}
