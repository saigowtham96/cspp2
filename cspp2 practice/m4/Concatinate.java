import java.util.*;
public class Concatinate{
	public static void main(String[] args){
		String a,b,c;
		Scanner s = new Scanner(System.in);
	    a = "Hello"+" ";
		System.out.print("enter the string");
		b = s.nextLine();
		c = a.concat(b);
		System.out.println(c+'!');
	}
	
}
