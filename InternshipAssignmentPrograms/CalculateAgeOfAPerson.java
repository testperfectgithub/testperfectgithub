package Assignment;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class CalculateAgeOfAPerson {


public static void main(String[] args) {
	System.out.println("Enter The Age Of A Person");
	Calendar birth=Calendar.getInstance();
	birth.set(2000, 07, 06);
	SimpleDateFormat sdf=new SimpleDateFormat("",Locale.US);
	sdf.applyPattern("yyyy/MM/dd");
	System.out.println(sdf.format(birth.getTime()));
	Calendar today=Calendar.getInstance();
	int age=today.get(Calendar.YEAR)-birth.get(Calendar.YEAR);
	if(today.get(Calendar.YEAR)<birth.get(Calendar.YEAR)) {
		age--;
	}
	System.out.println("Age="+age);
}
}
