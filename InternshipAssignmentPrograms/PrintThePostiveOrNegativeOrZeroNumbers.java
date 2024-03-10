package Assignment;

import java.util.Scanner;

public class PrintThePostiveOrNegativeOrZeroNumbers {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Values:");
	int n=sc.nextInt();
	if(n==0) {
		System.out.println("This Is Zero Value");
	}
	else if(n>0) {
		System.out.println("This Is Postive Value");
	}
	else {
		System.out.println("This Is Negative Value");
	}
}
}
