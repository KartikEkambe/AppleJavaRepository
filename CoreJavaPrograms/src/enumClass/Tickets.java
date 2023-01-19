package enumClass;

public enum Tickets {

	SILVER(150){
		public String toString() {
			return "Silver category rate is Rs 150/-";
		}
	},
	GOLD(200){
		public String toString() {
			return "Gold category rate is Rs 200/-";
		}
	},
	PLATINUM(250){
		public String toString() {
			return "Platinum category rate is Rs 250/-";
		}
	};
	int rate;
	private Tickets(int rate) {
		this.rate=rate;
	}
	
}
