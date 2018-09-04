import java.util.*;
import java.lang.Math;
public class StudentDetails {
	String Studentname;
	String Rollnumber;
	double subject1;
	double subject2;
	double subject3;
	double gpa;
public StudentDetails(String Studentname, String Rollnumber, double subject1, double subject2, double subject3) {
	this.Studentname = Studentname;
	this.Rollnumber  = Rollnumber;
	this.subject1 = subject1;
	this.subject2 = subject2;
	this.subject3 = subject3;
}	
public double gpa() {
	gpa = (subject1+subject2+subject3)/3;
	gpa = (Math.floor(gpa*10))/10;
	return gpa;

}

public static void main(String[] args) {
	StudentDetails s1 = new StudentDetails("Sangay", "IT201985001", 7.5, 7.0 8.0);
	System.out.println(s1.gpa());
	StudentDetails s2 = new StudentDetails("Bidhya", "IT201985003", 8.5, 6.0 7.5);
	System.out.println(s2.gpa());
	StudentDetails s3 = new StudentDetails("Kelzang", "IT201985065", 7.5, 8.0 9.0);
	System.out.println(s3.gpa());
}
}