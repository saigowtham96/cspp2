
//Write a java method that returns the decimal value for the given binary string.


import java.util.Scanner;
public final class Solution {
	/**.
	 * constructs the object
	 */
	private Solution() {
		/**
		 * @param     args
		 */
	}
/*
	Do not modify the main function 
	*/
	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse = reverse + s.charAt(i);
        }
		System.out.println(reverse);
	}
	//Write reverseString function

}
