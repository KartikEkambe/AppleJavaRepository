package enumClass;

public enum WeekDays {

	MONDAY {
		public String toString() {
			return "Monday associated with the Moon";
		}

	},
	TUESDAY {
		public String toString() {
			return "Tuesday associated with the Mars";
		}

	},
	WEDNESDAY {
		public String toString() {
			return "Wednesday is from germanic god Odin";
		}

	},
	THURSDAY {
		public String toString() {
			return "Thursday from Germanic god of thunder Thor";
		}
	},
	FRIDAY {
		public String toString() {
			return "Friday associated with Venus";
		}
	},
	SATURDAY {
		public String toString() {
			return "Saturday associated with the Saturn";
		}

	},
	SUNDAY {
		public String toString() {
			return "Sunday associated with the Sun";
		}
	};

}
