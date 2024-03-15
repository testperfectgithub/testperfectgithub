package Assignment;

import java.util.Scanner;

public class ConvertCelsiusToFahrenheit {
public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Celsius To Fahrenheit");
	 int result=sc.nextInt();
	 if(result==1) {
		 System.out.println("You Have Chosen Celsius To Fahrenheit");
		 System.out.println("Enter Celsius Value");
		 double value=sc.nextDouble();
		 double finalresult=value*1.8+32;
		 System.out.println("Enter Fahrenheit value=");
		 System.out.println(Math.round(finalresult*10.0/10.0));
	 }
	 else {
		 System.out.println("Not A Valid Choice");
	 }
}
}
