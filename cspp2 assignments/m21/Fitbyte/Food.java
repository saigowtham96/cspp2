class Food {
	private String itemName;
	private int quantity;
	private String date;
	private String time;

	public Food(String itemName1, String quantity1, String date, String time) {
		this.itemName = itemName1;
		this.quantity = Integer.parseInt(quantity1);
		this.date = date;
		this.time = time;
	}

	Food() { }

	public String getItemName(){
		return this.itemName;
	}

	public double getquantity() {
		return this.quantity;
	}

	public String getdate() {
		return this.date;
	}

	public String getTime() {
		return this.time;
	}

	public String toString() {
		String s = "";
		s = "Date:" + this.date +"\n"+ "Time:" + this.time + "\n" +
		    "Name:" + this.itemName + "\n" + "Quantity:" + this.quantity;
	    return s;
	}

}