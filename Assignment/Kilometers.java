package Assignment;

import java.util.Scanner;

public class Kilometers {
public static void main(String[] args) {
	int kilometer;int meter;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Distance In Kilometer");
	kilometer=sc.nextInt();
	meter=kilometer*1000;
	System.out.println("Distance In Meter="+meter);
	
}
}
