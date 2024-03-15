package Assignment;

import java.time.DateTimeException;
import java.util.Scanner;


public class CalculateSeconds {
public static void main(String[] args) {
int days;int hr;int min;int sec;
Scanner sc=new Scanner(System.in);
System.out.println("Enter The Time In Days");
days=sc.nextInt();
hr=24*days;
min=60*hr;
sec=60*min;
System.out.println("Hr="+hr);
System.out.println("Min="+min);
System.out.println("Sec="+sec);
}
}
