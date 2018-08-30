import java.util.*;
public class Average{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = s.nextInt();
		int a[] = new int[n];
		int i;
		double sum = 0;
		for(i=0;i<a.length;i++){
			a[i] = s.nextInt();
			sum = sum + a[i];
		}
		
		double Average = sum/n;
		System.out.println(Average);



	}
}