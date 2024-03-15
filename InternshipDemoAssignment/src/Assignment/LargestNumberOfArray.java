package Assignment;

import java.util.Scanner;

public class LargestNumberOfArray {
public static void main(String[] args) {
	int num[];int size;int largest;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Largest Of Array");
	size=sc.nextInt();
	num=new int[size];
	System.out.println("Enter Elements Of Array");
	for(int i=0;i<num.length;i++) {
		num[i]=sc.nextInt();
	}
	largest=num[0];
	for(int i=1;i<num.length;i++) {
		if(largest<num[i]) {
			largest=num[i];
		}
	}
	System.out.println("The Largest Number Is="+largest);
}
}
