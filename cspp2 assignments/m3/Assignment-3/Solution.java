 import java.util.Scanner;
/*Do not modify this main function.*/
/**.
 * Class for solution.
 */
public final class Solution {
    /**.
     * Constructs the object.
     */
    private Solution() {
    }
/**.
 * { function_description }
 *
 * @param      x1    The x 1
 * @param      x2    The x 2
 *
 * @return     { description_of_the_return_value }
 */
    public static int gcd(final int x1, final int x2) {
        int temp, y1 = x1, y2 = x2;
        while (y2 > 0) {
            temp = y1;
            y1 = y2;
            y2 = temp % y2;
        }
        return y1;
    }
    /**.
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int x1 = s.nextInt();
        int x2 = s.nextInt();
        int gcd = gcd(x1, x2);
        System.out.println(gcd);
    }
    /*Need to write the gcd function and print the output.*/
}











