import java.util.*;
public class Swap
{
	public static void main(String[] args)
	{
	Scanner s = new Scanner(System.in);
	int x = s.nextInt();
	int y = s.nextInt();
	x = x*y;
	y = x/y;
	x = x/y;
	System.out.println("swapping x and y: "+ x +"\n" + y);


	}
}