import java.util.*;
class DataBase {
	private List<Users> userObj;

	DataBase() {
		userObj = new List<Users>();
	}

	public void addConnection(String name, String follower) {
		int fname = -1;
		int fFlag = -1;
		for (int i = 0; i < userObj.size(); i++) {
			if (name.equals(userObj.get(i).getName())) {
				fname = i;
				// userObj.get(i).addFollower(follower);

			}
			if(follower.equals(userObj.get(i).getName())){
				fFlag = i;
			}

		}
		if(fname >=0 && fFlag >=0){
			 userObj.get(fname).addFollower(follower);
		}
		else{
			System.out.println("Not a user in Network");
		}

		// for (int i = 0; i < userObj.size(); i++) {
		// 	if (!follower.equals(userObj.get(i).getName())) {
		// 		System.out.println("Not a user in Network");
				
		// 	}

		// }
	}
	public void addConnection(Users userobject) {
		userObj.add(userobject);
	}
	public String getConnections(String name) {
		for (int i = 0; i < userObj.size(); i++) {
			if (name.equals(userObj.get(i).getName())) {
				return userObj.get(i).toString().split(": ")[1].replace(",",", ");
			}
		}
		return "Not a user in Network";
	}
	public void getCommonConnections(String userone, String usertwo) {
		List<String> arrayOne = new List<String>();
		List<String> arraTwo = new List<String>();
		List<String> result = new List<String>();
		for (int i = 0; i < userObj.size(); i++) {
			if (userone.equals(userObj.get(i).getName())) {
				arrayOne = userObj.get(i).getFollowerList();
				break;
			}
		}
		for (int i = 0; i < userObj.size(); i++) {
			if (usertwo.equals(userObj.get(i).getName())) {
				arraTwo = userObj.get(i).getFollowerList();
				break;
			}
		}
		for (int i = 0; i < arrayOne.size(); i++) {
			if (arraTwo.contains(arrayOne.get(i))) {
				result.add(arrayOne.get(i));
			}
		}
		System.out.println(result.toString().replace(",",", "));
	}
    
    public void showAll() {
		String[] userNames = new String[userObj.size()];
		for (int i = 0; i < userObj.size(); i++) {
			userNames[i] = userObj.get(i).toString().replace(",",", ");
		}
		Arrays.sort(userNames);
		String str = Arrays.toString(userNames);
		System.out.println(str.substring(1,str.length()-1));
	}

}