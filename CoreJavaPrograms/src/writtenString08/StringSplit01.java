package writtenString08;



public class StringSplit01 {

	public static void main(String[] args) {
		String s1="HELLO$WORLD";
		
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)=='$') {
				System.out.println();
			}else {
				System.out.print(s1.charAt(i));
			}
		}
		
		
		


	}

}
