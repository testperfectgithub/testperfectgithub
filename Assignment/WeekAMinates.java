package Assignment;

import java.util.Scanner;

public class WeekAMinates {
public static void main(String[] args) {
	int week;int days;int hr; int min; int sec;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Week days");
	days=sc.nextInt();
	week=7/days;
	hr=24/days;
	min=60/days;
	sec=60/days;
	System.out.println("Week="+week);
	System.out.println("Hr="+hr);
	System.out.println("Min="+min);
	System.out.println("Sec="+sec);
	
}
}
