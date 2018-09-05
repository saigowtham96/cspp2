
//Write a java method converts decimal value for the given binary string.


import java.util.Scanner;
/**.
 * class for solution
 */
public final class Solution {
/**.
* constructs the object
*/
    private Solution() {
    }
/**.
 * { function_description }
 *
 * @param      args  The arguments
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




