import java.util.*;
class Solution {

	Solution() { }
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DataBase dataObj = new DataBase();
		while (scan.hasNext()) {
			String line = scan.nextLine();
			if (line.contains(" is connected to ")) {
				String[] tokens = line.split(" is connected to ");
				String[] data = tokens[1].replace(".", "").split(", ");
				Users userObj = new Users(tokens[0]);
				for (int i = 0; i < data.length; i++) {
					userObj.addFollower(data[i]);
				}
				dataObj.addConnection(userObj);
			} else {
				String[] input  = line.split(" ", 2);
				switch (input[0]) {
				case "addConnections":
					String[] connection = input[1].split(" ");
					dataObj.addConnection(connection[0], connection[1]);
					break;
				case "getConnections":
					System.out.println(dataObj.getConnections(input[1]));
					break;
				case "CommonConnections":
					String[] follower = input[1].split(" ");
					dataObj.getCommonConnections(follower[0], follower[1]);
					break;
				case "Network":
					dataObj.showAll();
				default: break;
				}
			}

		}
	}
}