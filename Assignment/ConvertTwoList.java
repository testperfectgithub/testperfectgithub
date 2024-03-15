package Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertTwoList {
	public static <E> void main(String[] args) {
		List<Integer> num1 = new ArrayList<Integer>();
		List<Integer> num2 = new ArrayList<Integer>();
		num1.addAll(Arrays.asList(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }));
		num2.addAll(Arrays.asList(new Integer[] { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 3, 2, 1 }));
		System.out.println("List Num1=" + num1);
		System.out.println("List Num2=" + num2);
		List<Integer> num3 = new ArrayList<Integer>();
		num3.addAll(num2);
		num3.retainAll(num1);
		System.out.println("Common List Numbers Are=" + num3);
	}
}
