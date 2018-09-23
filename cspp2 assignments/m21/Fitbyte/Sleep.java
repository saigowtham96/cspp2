class Sleep {
	private String startTime;
	private String endTime;
	private String date;


	public Sleep(String date, String startTime, String endTime) {
		this.startTime = startTime;
		this.endTime = endTime;
		this.date = date;
	}

	Sleep() { }

	public String getStartTime() {
		return this.startTime;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public String getDate() {
		return this.date;
	}

	public String toString() {
		String s = "";
		s = "Date:" + this.date + "\n" +
		    "Starttime:" + this.startTime + "\n" +
		    "EndTime:" + this.endTime;
		return s;
	}
}