package inheritance;

public class PersonIdMain01 {

	public static void main(String[] args) {
		IdProof01 id=new IdProof01(76701811, "Aadhar", "Latur");
		
		Person01 p=new Person01("Ekambe", 23, "9096407047", id);
		System.out.println(p);

	}

}
