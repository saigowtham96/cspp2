import java.util.*;
class Practice {
	static int[] a = new int[10];
	static int index = 0;
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			int b = s.nextInt();
			addElement(b);
		}
		System.out.println(Arrays.toString(a));
	}

	public static void addElement(int number) {
		a[index] = number;
		index++;
	}

}
