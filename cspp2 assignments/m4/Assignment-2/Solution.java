import java.util.*;
/**.
 * Class for solution.
 */
public class Solution {
	/* Fill the main function to print resultant of addition of matrices*/
	/**.
	 * Constructs the object.
	 */
	private Solution() {
	}
	/**.
	 * Constructs the object.
	 *
	 * @param      a     { parameter_description }
	 */
	public int[][] readinput(int row, int col) {
		int[][] d = new int[row][col];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				d[i][j] = sc.nextInt();
			}
		}
		return d;
	}
	/**.
	 * { function_description }
	 *
	 * @param      args  The arguments
	 */
	public static void main(final String[] args) {
		Solution s = new Solution();
		Scanner sc = new Scanner(System.in);
		int row1, col1, row2, col2;
		row1 = sc.nextInt();
		col1 = sc.nextInt();
		int[][] a = new int[row1][col1];
		a = s.readinput(row1, col1);
		row2 = sc.nextInt();
		col2 = sc.nextInt();
		int[][] b = new int[row2][col2];
		b = s.readinput(row2, col2);
		if ( row1 == row2 && row2 == col2 ) {
			for (int i = 0; i < row1; i++) {
				for (int j = 0; j < col1; j++) {
					int sum = a[i][j] + b[i][j];
					System.out.print(sum + " ");;
				}
				System.out.print("\n");
			}
		}
		else
			System.out.println("not possible");
		
	}
}