package Assignment;

import java.util.Scanner;

public class PrintTheFiveNumbersAscendingOrder {
public static void main(String[] args) {
	int arr[]= {99,19,39,29,9};
	int temp=0;
	System.out.println("Enter The Numbers:");
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]+"");
	}
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[j]<arr[i]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	System.out.println("Ater The Numbers:");
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]+"");
	}
}
}
