package Assignment;

import java.util.Scanner;

public class FindTwoRatioNumbers {
public static void main(String[] args) {
	int ratio;int x;int y;int sum;
	Scanner sc=new Scanner(System.in);
	System.out.println("Find The Ratio With Two Numbers");
	x=sc.nextInt();
	y=sc.nextInt();
	sum=sc.nextInt();
	ratio=x+y;
	System.out.println(ratio);
	int ratio1=sum/ratio;
	System.out.println(ratio1);
	int ratiol1 = x*7;
	int ratiol2=y*7;
	System.out.println(ratiol1+":"+ratiol2);
	
	     
	
}
}
