package array;

public class ReplaceNumChar {
	
	void chars() {
		System.out.println((char)(97));
	}
	
	void replaceNum() {
		int num[]= {2,-1,56,-2,67,-9,90,-5};
		
		for(int i=0;i<num.length;i++) {
			if(num[i]<0) {
				num[i]=num[i]*0;
			}
			System.out.print(num[i] +" ");
		}
		System.out.println();
	}
	
	void replaceChar() {
		int ch[]= {'a','B','C','d','e','F'};
		
		for(int i=0;i<ch.length;i++) {
			
			if(ch[i]>='a' && ch[i]<='z') {
				ch[i]=ch[i]-32;
			}
			else if(ch[i]>='A'&&ch[i]<='Z') {
				ch[i]=ch[i]+32;
			}
			
			System.out.print((char)ch[i] +" ");


		}
		System.out.println();
	}
	

	public static void main(String[] args) {
		ReplaceNumChar num=new ReplaceNumChar();
		num.replaceNum();
		num.replaceChar(); 
		num.chars();

	}

}
