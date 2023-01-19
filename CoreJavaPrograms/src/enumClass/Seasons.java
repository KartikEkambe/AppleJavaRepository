package enumClass;

interface SeasonDetails {
	void description();
}

public enum Seasons implements SeasonDetails {

	RAINY {
		public void description() {
			System.out.println("Rainy Season");
		}

	},
	WINTER {
		public void description() {
			System.out.println("Winter Season");
		}
	},
	SUMMER {
		public void description() {
			System.out.println("Summer Season");
		}
	};

}
