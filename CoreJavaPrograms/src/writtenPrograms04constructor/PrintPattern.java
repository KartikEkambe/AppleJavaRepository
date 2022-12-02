package writtenPrograms04constructor;

public class PrintPattern {
	
	
	 PrintPattern() {
		 int num=9;
		 for(int i=num;i>0;i--) {
			 for(int s=i;s>0;s--) {
				 System.out.print(" ");
			 }
			 
			 for(int j=i;j<=num;j++) {
				 System.out.print(j);
			 }
			 
			 for(int k=num-1;k>=i;k--) {
				 System.out.print(k);
			 }
			 System.out.println();
		 }
		 

	}
	 
	 
	 PrintPattern(int num){
		 int alpha=65;
		 for(int i=num;i>=0;i--) {
			 for(int j=0;j<=i;j++) {
				 System.out.print((char)(j+alpha)+" ");
			 }
			 System.out.println();
		 }
		 
		 for(int i=0;i<=num;i++) {
			 for(int j=0;j<=i;j++) {
				 System.out.print((char)(j+alpha)+" ");
			 }
			 System.out.println();
		 }
	 }
	 
	 
	 public static void main(String[] args) {
		 PrintPattern p=new PrintPattern();
		PrintPattern p2=new PrintPattern(5);
		
	}

}
