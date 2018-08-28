import java.util.Scanner;
import java.lang.Math.*;

public final class Solution {
	private Solution() { /**.
		*This is a constructor*/
	} 
	/**.
	@param args of the type string
	*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		rootsOfQuadraticEquation(a, b, c);
	} /**.
	   @param b = numeric element of the equation
	   @param c = numeric element of the equation
	   @param a = numeric element of the equation
	   */
	static void rootsOfQuadraticEquation(int a, int b, int c) {
     double root1 = ( -b + Math.sqrt( b * b - 4 * a * c ) ) / (2 * a);
     double root2 = ( -b - Math.sqrt( b * b - 4 * a * c ) ) / (2 * a);
     System.out.println(root1 + " " + root2);
	}
	/*
	Need to write the rootsOfQuadraticEquation function and print the output.
	*/
}
