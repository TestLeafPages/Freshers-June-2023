package week5.day4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SecondLargestNumber {
public static void main(String[] args) {
	int[] num={10,2,3,4,9,5,6,7};

	List<Integer> val=new LinkedList<Integer>();
	
	
	for (int i = 0; i < num.length; i++) {
		val.add(num[i]);
	}
	System.out.println(val);
	
	Collections.sort(val);
	System.out.println(val);
	
	
	//Print second largest number
	Integer integer = val.get(val.size()-2);
	System.out.println(integer);
	
}
}
