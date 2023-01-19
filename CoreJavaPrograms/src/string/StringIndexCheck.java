package string;

public class StringIndexCheck {
	public static void main(String[] args) {
		int alpha= 97;
//		int cnt=1;
		String s="The quick brown box jumps over the lazy dog";
		for(int i=0;i<s.length();i++) {
			if(alpha==s.charAt(i)) {
				System.out.println((char)(alpha)+" = "+i);
				
			alpha++;
			}
			
			
		}
		
		
		
	}

}
