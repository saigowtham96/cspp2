import java.util.*;
/**
 * Class for area of circle.
 */
class area_of_circle {
	/**
	 * { function_description }
	 *
	 * @return     { description_of_the_return_value }
	 */
	static double pi() {
		double pie =3.14;
		return pie;
	}
	/**
	 * { function_description }
	 *
	 * @param      radius  The radius
	 *
	 * @return     { description_of_the_return_value }
	 */
	static double area( double radius) {
		double pie=pi();
		double area = pie* radius*radius;
		return area;
	}
	/**
	 * { function_description }
	 *
	 * @param      args  The arguments
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double radius = s.nextDouble();
		double area = area(radius);
		System.out.println("Area of circle: "+area);
		
	}
}