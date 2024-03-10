package Assignment;

import java.util.Scanner;

public class DivisorsNumber {
public static void main(String[] args) {
	int number;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter The Divisor Number");
	number=sc.nextInt();
	sc.close();
	System.out.println("Divisor Of The Number Is="+number);
	for(int divisor=1;divisor<=number;divisor++) {
		if((number%divisor)==0) {
			System.out.printf("%d ",divisor);
		}
	}
}
}
