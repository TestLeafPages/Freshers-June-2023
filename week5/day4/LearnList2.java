package week5.day4;

import java.util.ArrayList;
import java.util.List;

public class LearnList2 {
public static void main(String[] args) {
	
	List<String> name=new ArrayList<String>();
	
	name.add("TCS");
	name.add("HCL");
	name.add("CTS");
	name.add("Zoho");
	name.add("Infosys");
	
	System.out.println(name);
	
	
	System.out.println(name.size());
	for (int i = 0; i < name.size(); i++) {
		String value = name.get(i);
		System.out.println(value);
	}
	
	String string = name.get(2);
	System.out.println("Index"+string);
	
}
}
