import java.util.*;
class Client {
	Client() {

	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Data log = new Data();
		while (scan.hasNext()) {
			String line = scan.nextLine();
			String[] tokens = line.split(" ");
			switch(tokens[0]) {
				case "Food":
					String[] data = tokens[1].split(",");
					Food foodObj = new Food(data[0], data[1], data[2], data[3]);
					log.addFood(foodObj);
					break;
				case "Water":
					String[] waterData = tokens[1].split(",");
					Water waterObj = new Water(waterData[0], waterData[1]);
					log.addWater(waterObj);
					break;
				case "PhysicalActivity":
					String[] activity = tokens[1].split(",");
					PhysicalActivity activityObj = new PhysicalActivity(activity[0], activity[1], activity[2], activity[3], activity[4]);
					log.addPhysicalActivity(activityObj);
					break;
				case "Weight":
					String[] weights = tokens[1].split(",");
					Weight weightObj = new Weight(weights[0], weights[1], weights[2], weights[3]);
					log.addWeight(weightObj);
					break;
				case "Sleep":
					String[] duration = tokens[1].split(",");
					Sleep sleepObj = new Sleep(duration[0], duration[1], duration[2]);
					log.addSleep(sleepObj);
					break;
				// case "showLog":
				// 	log.showAll();
				// 	break;
				case "Summary":
					log.getSummary();
					break;
				case "Foodlog":
				    System.out.println("Food");
					log.foodlog();
					System.out.println();
					break;
				case "Waterlog":
				    System.out.println("Water");
					log.waterlog();
					System.out.println();
					break;
				case "PhysicalActivitylog":
					System.out.println("PhysicalActivity");
					log.physicalActivitylog();
					System.out.println();
					break;
				case "Weightlog":
					System.out.println("Weight");
					log.weightlog();
					System.out.println();
					break;
				case "Sleeplog":
					System.out.println("Sleep");
					log.sleeplog();
					System.out.println();
					break;
				default: break;

			}
		}
	}
}
