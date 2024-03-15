package Assignment;

import java.util.Scanner;

public class FindLargestNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Yhe Value");
	double num1=sc.nextDouble();
	double num2=sc.nextDouble();
	double num3=sc.nextDouble();
	double Largest=FindLargestNumber(num1,num2,num3);
	System.out.println("The Largest Number Is= "+Largest);
	sc.close();
	
}

private static double FindLargestNumber(double num1, double num2, double num3) {
	// TODO Auto-generated method stub
	if(num1>=num2 && num1>=num3) {
		return num1;
	}
	else if(num2>=num1 && num2>=num3) {
		return num2;
	}
	else {
		return num3;
	}
	 
}
}
