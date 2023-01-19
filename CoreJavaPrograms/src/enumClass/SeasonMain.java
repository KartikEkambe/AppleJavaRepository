package enumClass;

public class SeasonMain {

	public static void main(String[] args) {
		
		Seasons s[]=Seasons.values();
		for(Seasons ss:s) {
			System.out.println(ss);
			ss.description();
		}


	}

}
