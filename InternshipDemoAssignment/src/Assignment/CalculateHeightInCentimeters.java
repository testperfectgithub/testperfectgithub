package Assignment;

import java.util.Scanner;



public class  CalculateHeightInCentimeters {
public static void main(String[] args) {
	int height;double cm;
	Scanner sc=new Scanner(System.in);
	System.out.println("Calculate Height In Centimeters");
	height=sc.nextInt();
	cm=height*2.54;
	System.out.println("Given To Centimeter Is="+height);
}
}
