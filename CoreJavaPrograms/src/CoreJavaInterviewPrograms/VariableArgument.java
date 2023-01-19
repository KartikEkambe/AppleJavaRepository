package CoreJavaInterviewPrograms;

public class VariableArgument {
	void add(String name,int ...marks) {
		int sum=0;
		for(int i=0;i<marks.length;i++) {
			sum=sum+marks[i];
		}
		System.out.println(name);
		System.out.println("Percent : "+sum/marks.length);
	}

	public static void main(String[] args) {
		VariableArgument va=new VariableArgument();
		va.add("Vaibhav", 60,70,80,77,88);

	}

}
