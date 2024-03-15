package Assignment;

import java.util.Scanner;

public class FindLcmTwoNumbers {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Two Numbers");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=0;
	for(int i=1;i<=a;i++) {
		if(a%i==0&&b%i==0) {
			c=i;
		}
		int lcm=a*b/c;
		System.out.println("Lcm="+lcm);
	}
}
}
