package Assignment;

import java.util.Scanner;

public class ReverseNumbers {
public static void main(String[] args) {
	int n; int r;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Value");
	n=sc.nextInt();
	while(n>0) {
		r=n%10;
		System.out.print(r);
		n=n/10;
	}
	}
}
