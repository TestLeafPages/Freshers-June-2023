package week5.day5;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet2 {
public static void main(String[] args) {
	
	//Set<Integer> number=new LinkedHashSet<>();
	//Set<Integer> number=new TreeSet<Integer>();
	Set<String> name=new LinkedHashSet<String>();
	name.add("Dhaya");
	boolean add = name.add("Kavin");
	System.out.println(add);
	name.add("Harish");
	name.add("Dhanush");
	name.add( "mani");
	name.add("anil");
	name.add("Arun");
	boolean add2 = name.add("Kavin");
	System.out.println("secondTime"+add2);
	System.out.println(name);
	
	//[Arun, Dhanush, Dhaya, Harish, Kavin, anil, mani]
	//[Dhanush, Dhaya, Kavin, Harish]

}
}
