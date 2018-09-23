class PhysicalActivity {
	private String activityName;
	private String startTime;
	private String endTime;
	private String notes;
	private String date;

	public PhysicalActivity(String activityName, String notes, String date, String startTime, String endTime) {
		this.activityName = activityName;
		this.startTime = startTime;
		this.endTime = endTime;
		this.notes = notes;
		this.date = date;
	}

	PhysicalActivity() { }

	public String getActivityName() {
		return this.activityName;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public String getNotes() {
		return this.notes;
	}

	public String getDate() {
		return this.date;
	}

	public String toString() {
		String s = "";
		s = "Name:" + this.activityName + "\n" +
		    "Notes:" + this.notes + "\n" +
            "Date:" + this.date + "\n" +
            "Starttime:" + this.startTime + "\n" +
            "Endtime:" + this.endTime;
        return s;
	}
}