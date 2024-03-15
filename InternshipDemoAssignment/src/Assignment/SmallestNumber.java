package Assignment;

import java.util.Scanner;

public class SmallestNumber {
public static void main(String[] args) {
	int n[];int size;int smallest;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Smallest Value");
	size=sc.nextInt();
	n=new int[size];
	System.out.println("Enter The Elements");
	for(int i=0;i<n.length;i++) {
n[i]=sc.nextInt();
	}
	smallest=n[0];
	for(int i=1;i<n.length;i++) {
		if(smallest>n[i]) {
			smallest=n[i];
		}
	}
	System.out.println(smallest);
}
}
