class Water {
	private String date;
	private int water;

	public Water(String water1,String date) {
		this.date = date;
		this.water = Integer.parseInt(water1);
	}

    Water() { }

	public double getWater() {
		return this.water;
	}

	public String getDate() {
		return this.date;
	}

	public String toString() {
		String s = "";
		s = "Date:" + this.date + "\n" +
		    "Quantity:" + this.water + "ml";
		return s;
	}

}