package week5.day4;

import java.util.ArrayList;
import java.util.List;

public class LearnList {
public static void main(String[] args) {
	
	List<String> name=new ArrayList<String>();
	
	name.add("Dhaya");
	name.add("Kavin");
	name.add("Harish");
	name.add("Dhanush");
//	name.add(0, "Mani");
	
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
