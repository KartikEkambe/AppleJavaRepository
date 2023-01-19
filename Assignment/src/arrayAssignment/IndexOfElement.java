package arrayAssignment;

public class IndexOfElement {

	public static void main(String[] args) {
		int a[]= {1,2,3,5,8,13,21,34,55};
		
		int element=34;
		
		for(int i=0;i<a.length;i++) {
			if(element==a[i]) {
				System.out.println(a[i]+" is presenet at index of : "+i);
			}
		}

	}

}
