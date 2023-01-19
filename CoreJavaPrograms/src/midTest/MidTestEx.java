package midTest;

import java.util.Arrays;

public class MidTestEx {
	//write code to caluculate the average of even digit from the number
	
	//Create string type of array and sort array on the basis of string length on the decending order
	
//	void average(int num) {
//		int rem,cnt=0;
//		int add=0;
//		while(num!=0) {
//			rem=num%10;
//		
//			if(rem%2==0) {
//				 add=add+rem;
//				 cnt++;
//			}
//			num=num/10;
//		}
//		int avg=add/cnt;
//		System.out.println("Average is : "+avg);
//	}
	
void sortString(String str[]) {
		
		for(int i=0;i<str.length;i++) {
			for(int j=i+1;j<str.length;j++) {
				if(str[i].length()<str[j].length()) {
				
					String temp=str[i];
					str[i]=str[j];
					str[j]=temp;
					
				
				}
			}
		}
		
		System.out.println(Arrays.toString(str));
	}
	public static void main(String[] args) {
		MidTestEx m=new MidTestEx();
		String str[]= {"core","advance","length","Java"};
//		m.average(123456);
		m.sortString(str);

}
}