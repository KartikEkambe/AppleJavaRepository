package string;

public class StringArray {

	public static void main(String[] args) {
		
		String str[]= {"Raj","Aadya","Veer","Rahul","Anjali","Ajay","Leena","Reena"};
		
		for(int i=0;i<str.length;i++) {
			
			char ch[]=str[i].toCharArray();
			
			//without using pre-defined methods
			//prints string starting with R
			
//			if(ch[0]=='R')
//			{
//				String s=new String(ch);
//				System.out.println(s);
//			}
			
			
			//prints String ending with a
			
//			if(ch[ch.length-1]=='a')
//			{
//				String s=new String(ch);
//				System.out.println(s);
//			}
			
			for(int j=0;j<ch.length;j++) {
				if(ch[j]=='j')
				{
					String s=new String(ch);
					System.out.println(s);
					break;
				}
			}
			
		}

	}

}
