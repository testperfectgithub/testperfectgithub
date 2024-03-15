package Assignment;

import java.util.Scanner;

public class AreaOfRectangle {
public static void main(String[] args) {
	int l,b,area;
	System.out.println("Enter The AreaOfRectangle Value ");
	Scanner sc=new Scanner(System.in);
	l=sc.nextInt();
	b=sc.nextInt();
	area=l*b;
	System.out.println(area);
}
}
