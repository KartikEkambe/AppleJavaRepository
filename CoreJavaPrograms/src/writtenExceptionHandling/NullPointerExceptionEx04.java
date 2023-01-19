package writtenExceptionHandling;

public class NullPointerExceptionEx04 {
	int scenarioOne(String s) {
		return s.length();
	}
	String scenarioTwo(String s) {
		return s.toLowerCase();
	}
	
	void scenarioThree() {
		int arr[]=null;
		System.out.println(arr.length);
	}

	public static void main(String[] args) {
		
		NullPointerExceptionEx04 ex=new NullPointerExceptionEx04();
		try {
			try {
				try {
					System.out.println(ex.scenarioOne(null));
					}
					catch(NullPointerException e) {
						e.printStackTrace();
					}	
				System.out.println(ex.scenarioTwo(null));
			}
				catch(NullPointerException e) {
					e.printStackTrace();
				}
			ex.scenarioThree();
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
		System.out.println("Done...");
		
		

	}

}
