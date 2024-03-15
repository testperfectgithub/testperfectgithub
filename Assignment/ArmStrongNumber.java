package Assignment;

import java.util.Scanner;

public class ArmStrongNumber {
public static void main(String[] args) {
	int n; int arm=0;int rem;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Value");
	n=sc.nextInt();
	int temp=n;
	while(n>0) {
		rem=n%10;
		arm=(rem*rem*rem)+arm;
		n=n/10;
	}
	if(temp==arm) {
		System.out.println("ArmStrong Number");
	}else {
		System.out.println("Not ArmStrong Number");
	}
}
}
