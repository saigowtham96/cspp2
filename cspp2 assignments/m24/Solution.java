import java.util.*;
import java.io.*;
class SubString {
	SubString() {

	}
	void substr(File[] list) {
		ArrayList<String> text = new ArrayList<>();
		File[] listOfFiles = list;
	}
}
public class Solution {
	public static void main(String[] args) {
		SubString objsubStr = new SubString();
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		File file = new File(input);
		// System.out.println(file);
		File[] listOfFiles = file.listFiles();
		Arrays.sort(listOfFiles);
		System.out.println(Arrays.toString(listOfFiles));
		objsubStr.substr(listOfFiles);

		ArrayList<String> list = new ArrayList<String>();
		try {
			for (File s : listOfFiles) {
				String str = "";
				Scanner sc1 = new Scanner(s);
				while (sc1.hasNext()) {
					str += sc1.next() + " ";
				}
				list.add(str);
			}
			System.out.println(list);
			// Iterator itr = listOfFiles.iterator();
			// while(itr.hasNext())
			// 	System.out.println(itr.next());
			// }
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		Map<String, Integer> map1 = new HashMap<>();
		Map<String, Integer> map2 = new HashMap<>();
		map1 = creatMap("Rohith is a very very good boy");
		map2 = creatMap("gautham is a dirt fellow in iiit in gachibowli ");
		int value = formula(map1, map2);
		System.out.println(value);
	}
	public static Map creatMap(String text1) {
		String[] txt1 = text1.split(" ");
		// String[] txt2 = "gautham is a dirt fellow in iiit in gachibowli ".split(" ");
		Map<String, Integer> map = new HashMap<>();
		for (String each : txt1) {
			if (map.containsKey(each)) {
				map.put(each, map.get(each) + 1);
			} else {
				map.put(each, 1);
			}
		}
		return map;
		// System.out.println(map1);
		// for (String each : txt2) {
		// 	if (map2.containsKey(each)) {
		// 		map2.put(each, map2.get(each) + 1);
		// 	} else {
		// 		map2.put(each, 1);
		// 	}
		// }
		// System.out.println(map2);
	}
	public static int formula(Map<String, Integer> m1, Map<String, Integer> m2) {
		int product = 0;
		double denomOne = 0, denomTwo = 0;
		for (String each1 : m1.keySet()) {
			for(String each2 : m2.keySet()) {
				if(each1.equals(each2)) {
					product += m1.get(each1) * m2.get(each2);
				}
			}
		}
		for (String each1 : m1.keySet()) {
			denomOne += Math.pow(m1.get(each1), 2);
		}
		denomOne = Math.sqrt(denomOne);
		for (String each2 : m2.keySet()) {
			denomTwo += Math.pow(m2.get(each2), 2);
		}
		denomTwo = Math.sqrt(denomTwo);
		double denominator = denomOne * denomTwo;

		double formula = (product / denominator) * 100;
		return (int) formula;
	}


}