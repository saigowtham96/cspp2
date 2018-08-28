import java.util.Scanner;
/**.
 * public class
 */
public final class Solution {
    /**.
     *constructor
    */
    private Solution() { 
    }
    /**.
     * { main function }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        equation(a, b, c);
    }
    /**.
       @param b = numeric element of the equation
       @param c = numeric element of the equation
       @param a = numeric element of the equation
       */
    static void equation(final int a, final int b, final int c) {
     double root1 = (-b + Math.sqrt(b * b - 2 * 2 * a * c)) / (2 * a);
     double root2 = (-b - Math.sqrt(b * b - 2 * 2 * a * c)) / (2 * a);
     System.out.println(root1 + " " + root2);
    }
    /*
    Need to write the rootsOfQuadraticEquation function and print the output
    */
}
