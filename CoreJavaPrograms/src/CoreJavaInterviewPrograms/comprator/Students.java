package CoreJavaInterviewPrograms.comprator;

import java.util.Comparator;

public class Students  {
	
		private int sid;
		private String sname;
		private String qualification;
		private float percentage;
		public Students() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Students(int sid, String sname, String qualification, float percentage) {
			super();
			this.sid = sid;
			this.sname = sname;
			this.qualification = qualification;
			this.percentage = percentage;
		}
		public int getSid() {
			return sid;
		}
		public void setSid(int sid) {
			this.sid = sid;
		}
		public String getSname() {
			return sname;
		}
		public void setSname(String sname) {
			this.sname = sname;
		}
		public String getQualification() {
			return qualification;
		}
		public void setQualification(String qualification) {
			this.qualification = qualification;
		}
		public float getPercentage() {
			return percentage;
		}
		public void setPercentage(float percentage) {
			this.percentage = percentage;
		}
		@Override
		public String toString() {
			return "Students [sid=" + sid + ", sname=" + sname + ", qualification=" + qualification + ", percentage="
					+ percentage + "]";
		}
		
		
		
		
	

}
