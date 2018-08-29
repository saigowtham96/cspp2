import java.util.Scanner;
public class SumOfNNumbers {
	public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	int num = s.nextInt();
	int count = 0;
	int total = 0;
	for(count = 0;count<=num;count++){
		total = total+count;

	}
	System.out.println("the sum of first n natural numbers is"+total);
}
}