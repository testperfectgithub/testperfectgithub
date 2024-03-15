package Assignment;

import java.util.Scanner;

public class PrintYearIntoWeeks {
	public static void main(String[] args) {
		int days;
		int years;
		int weeks;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Days");
		days = sc.nextInt();
		years = (days / 365);
		weeks = (days % 365) / 7;
		days = (days % 365) % 7;
		System.out.println("Years=" + years);
		System.out.println("Weeks=" + weeks);
		System.out.println("Days=" + days);
	}
}
