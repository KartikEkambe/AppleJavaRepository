package string;

public class SumOfChar {

	public static void main(String[] args) {
		String str="Sky is the limit";
		String s=str.toUpperCase();
		String s1[]=s.split(" ");
		
		for(int i=0;i<s1.length;i++) {
			int sum=0;
			char ch[]=s1[i].toCharArray();
			for(int j=0;j<ch.length;j++) {
				int a=ch[j]-64;
				sum=sum+a;
			}
			System.out.println(s1[i]+" = "+sum);
		}

	}

}
