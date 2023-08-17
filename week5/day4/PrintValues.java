package week5.day4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class PrintValues {
public static void main(String[] args) {
	
	List<Integer> number=new LinkedList<>();
	number.add(10);
	number.add(20);
	number.add(70);
	number.add(50);
	number.add(100);
	number.add(30);
	
	System.out.println(number);
	
	Collections.sort(number);
	System.out.println(number);
	
	Collections.reverse(number);
	System.out.println(number);
	
	boolean contains = number.contains(40);
	System.out.println(contains);
	
	//number.clear();
//	System.out.println(number);
	
	boolean empty = number.isEmpty();
	System.out.println(empty);
}
}
