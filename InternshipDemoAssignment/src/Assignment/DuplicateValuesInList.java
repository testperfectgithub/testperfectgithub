package Assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateValuesInList {

	public static void main(String[] args) {
		List<String> names=new ArrayList<String>();
		names.add("Balaram");
		names.add("Dinga");
		names.add("Dingi");
		names.add("Ramesh");
		names.add("Mahesh");
		names.add("Suresh");
		names.add("KaliDas");
		names.add("Govinda");
		names.add("VaraLama");
		names.add("Sathyavathi");
		names.add("VaraLama");
		names.add("Govinda");
		names.add("Sathyavathi");
		names.add("KaliDas");
		names.add("Balaram");
		
		Set<String> s=new HashSet<String>();
		
		for(String name:names) {
			if(s.add(name)==false) {
				System.out.println(name);
			}
		}
	}
}
