class Data {
	private String date;
	private Food[] foodlog;
	private Water[] waterlog;
	private PhysicalActivity[] physicalActivitylog;
	private Weight weight;
	private Sleep sleep;
	private int foodIndex = 0;
	private int waterIndex = 0;
	private int phyActIndex = 0;

	public Data(String date, Weight weight, Sleep sleep) {
		foodlog = new Food[10];
		waterlog = new Water[10];
		physicalActivitylog = new PhysicalActivity[10];
		this.weight = weight;
		this.sleep = sleep;
		this.date = date;

	}


	Data() {
		foodlog = new Food[10];
		waterlog = new Water[10];
		physicalActivitylog = new PhysicalActivity[10];
		this.weight = weight;
		this.sleep = sleep;
		this.date = date;
	}
    
	public void addFood(Food name) {
		foodlog[foodIndex++] = name;
	}

	public void addWater(Water water) {
		waterlog[waterIndex++] = water;
	}

	public void addPhysicalActivity(PhysicalActivity name) {
		physicalActivitylog[phyActIndex++] = name;
	}
    
    public void addWeight(Weight obj) {
    	this.weight = obj;
    }

    public void addSleep(Sleep obj) {
    	this.sleep = obj;
    }
    
    public Food getFoodlog(int index) {
    	return foodlog[index];
    }
    public Water getWaterlog(int index) {
    	return waterlog[index];
    }
    public PhysicalActivity getPhysicalActivitylog(int index) {
    	return physicalActivitylog[index];
    }
    // public Weight getFoodlog(int index) {
    // 	return foodlog[index];
    // }
    // public Food getFoodlog(int index) {
    // 	return foodlog[index];
    // }
    // public Food getFoodlog(int index) {
    // 	return foodlog[index];
    // }


	public void getSummary() {
		//System.out.println(this.date);
        System.out.println("Food");
		for (int i = 0; i < foodIndex; i++) {
			System.out.println(getFoodlog(i).toString());
		}
		System.out.println("Water");
		for (int i = 0; i < waterIndex; i++) {
			System.out.println(getWaterlog(i).toString());
		}
		System.out.println("PhysicalActivity");
		for (int i = 0; i < phyActIndex; i++) {
			System.out.println(getPhysicalActivitylog(i).toString());
		}
		System.out.println("Weight");
		System.out.println(weight.toString());
		System.out.println("Sleep");
		System.out.println(sleep.toString());

	}

	public void foodlog() {
		for (int i = 0; i < foodIndex; i++) {
			System.out.println(getFoodlog(i).toString());
		}
	}

	public void waterlog() {
		for (int i = 0; i < waterIndex; i++) {
			System.out.println(getWaterlog(i).toString());
		}
	}

	public void physicalActivitylog() {
		for (int i = 0; i < phyActIndex; i++) {
			System.out.println(getPhysicalActivitylog(i).toString());
		}
	}

	public void weightlog() {
		System.out.println(weight.toString());
	}

    public void sleeplog() {
    	System.out.println(sleep.toString());
    }

}