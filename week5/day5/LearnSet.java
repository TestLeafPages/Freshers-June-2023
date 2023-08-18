package week5.day5;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
public static void main(String[] args) {
	
	//Set<Integer> number=new LinkedHashSet<>();
	//Set<Integer> number=new TreeSet<Integer>();
	Set<Integer> number=new HashSet<Integer>();
	number.add(1);
	number.add(10);
	number.add(2);
	number.add(7);
	number.add(3);
	//linkedHashSet [1, 10, 2, 7, 3]
	//treeSet [1, 2, 3, 7, 10]
  //hashSet [1, 2, 3, 7, 10]
	System.out.println(number);
}
}
