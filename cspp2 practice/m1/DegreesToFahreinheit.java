import java.util.Scanner;

public class DegreesToFahreinheit
{
	public static void main(String[] args)
	{
		double conversion;
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		conversion = (x*1.8)+32;
		System.out.println(conversion);
	}
}