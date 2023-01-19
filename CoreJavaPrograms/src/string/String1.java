package string;

public class String1 {

	public static void main(String[] args) {
		String str="Java Language";
		char chh='a';
		char ch[]=str.toCharArray();
		int cnt=0;
		for(int i=0;i<ch.length;i++) {
//			if(ch[i]==chh) {
//				cnt++;
//			}
			
			if(ch[i]=='a') {
				ch[i]='A';
			}
			
//			System.out.print(ch[i]);
		}
		
		String s1= new String(ch);
		System.out.println(s1);
//		System.out.println(chh+" "+cnt  );
	

	}

}
