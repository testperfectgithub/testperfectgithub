package Assignment;

import java.util.ArrayList;
import java.util.List;

public class PrintFirstElementAndLastElement {
public static void main(String[] args) {
	List<Integer> li=new ArrayList<Integer>();
	li.add(10);
	li.add(20);
	li.add(30);
	li.add(40);
	System.out.println(li);
	System.out.println("List="+li.set(0, 10));
	System.out.println("List="+li.set(3, 40));
	
}
}
