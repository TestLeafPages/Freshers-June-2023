package week5.day5;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SecondLargestNumberUsingSet {
public static void main(String[] args) {
	int[] number={100,400,700,200,500,100,500,200,80};
	
	//create an empty set
	Set<Integer> val=new TreeSet<Integer>();
	//Iterate the values from number
	for (int i = 0; i < number.length; i++) {
		//add the values in set
		val.add(number[i]);
	}
	//print the unique number
	System.out.println(val);
	//Create an empty list and converted list into set
	List<Integer> secondNumber=new ArrayList<Integer>(val);
	//print the list
	System.out.println(secondNumber);
	//Print Second Largest Number in List
	System.out.println("SecondLargestNumber"+secondNumber.get(secondNumber.size()-2));
}
}
