import java.util.Scanner;
/**
 * class for solution.
 */
public final class Solution {
	/**
	 * Constructs the object.
	 */
	private Solution() {
		/**.
		 * { constructor}
		 */
	}
/* Fill the main function to print the number of 7's between 1 to n*/
	public static void main(final String[] args) {
		Scanner s = new Scanner(System.in);    
		int n = s.nextInt();
		int count = 0;
		final int a = 10;
		final int b = 7;
		for (int i = 0; i <= n; i++) {
			int j = i;
			while (j >= 1) {
				if (j % a == b) {
					count = count + 1;
				}
			 j = j / 10;	
			}
		}
		System.out.println(count);
	}
}


