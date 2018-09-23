class Weight {

	private String kg;
	private String fat;
	private String date;
	private String time;


	public Weight(String date, String time, String kg, String fat) {
		this.kg = kg;
		this.fat = fat;
		this.date = date;
		this.time = time;
	}

	Weight() { }

	public String getWeight() {
		return this.kg;
	}

	public String getFat() {
		return this.fat;
	}

	public String getDate() {
		return this.date;
	}

    public String getTime() {
    	return this.time;
    }

	public String toString() {
		String s = "";
		s = "Date:" + this.date + "\n" +
		    "Time:" + this.time + "\n" +
		    "Weight:" + this.kg + "\n" +
		    "Fat:" + this.fat;
		return s;
	}
}