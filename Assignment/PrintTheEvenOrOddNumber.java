package Assignment;

import java.util.Scanner;

public class PrintTheEvenOrOddNumber {
public static void main(String[] args) {
	int n;
	System.out.println("Enter The Even Or Odd Numbers");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	if(n%2==0) {
		System.out.println("This Is Even Number");
	}
	else {
		System.out.println("This Is Odd Number");
	}
}
}
