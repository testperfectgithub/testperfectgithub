package Assignment;

import java.util.Scanner;

public class PerimeterOfTriangle {
public static void main(String[] args) {
	int perimeter;int a;int b;int c;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Perimeter Of Triangle");
	
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	perimeter=a+b+c;
	System.out.println("PermiterOfTriangle="+perimeter);
}
}
