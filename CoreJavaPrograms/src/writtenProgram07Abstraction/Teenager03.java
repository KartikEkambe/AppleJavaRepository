package writtenProgram07Abstraction;

public class Teenager03 extends Kid03{

	void readBook() {
		System.out.println("Read the book from Teenager");
	}
	
	public static void main(String[] args) {
		Kid03 k1=new BigKid03();
		k1.readBook();
		k1.readBook("The Great Warrior Sambhaji", "Vishwas Patil");
		
		Kid03 k2=new Teenager03();
		k2.readBook();
	
		}
}
