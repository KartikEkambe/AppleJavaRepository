package writtenArray09;

public class MinCharacter {

	public static void main(String[] args) {
		char ch[]= {'A','D','E','x','z','R'};

		char min = 'z';
		char max='A';

		for(int i=0;i<ch.length-1;i++) {
			if(ch[i]<min) {
				min=ch[i];
			}
			if(ch[i]>max) {
				max=ch[i];
			}

		} 
		System.out.println(min);
		System.out.println(max);
		

	}

}
