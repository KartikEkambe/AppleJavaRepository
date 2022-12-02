package inheritance.hierarchicalInheritance;

public class Student extends Person {
	static String college = "MDM College Aurad Shah";
	float percent;

	public float getPercent() {
		return percent;
	}

	public void setPercent(float percent) {
		this.percent = percent;
	}

	void grade(float percent) {
		if (percent > 85)
			System.out.println("Grade A ");
		else if (percent <= 85 && percent > 65)
			System.out.println("Grade B ");
		else if (percent <= 65 && percent > 45)
			System.out.println("Grade C ");
		else if (percent <= 45 && percent > 35)
			System.out.println("Grade D");
		else
			System.out.println("Failed !!!");

	}

}
