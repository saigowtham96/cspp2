import java.util.Scanner;
/**.
 * class for solution
 */
public final class Solution {
/**.
* constructor
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
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max = a[0];
        for (int i = 0; i < n; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}
