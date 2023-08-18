package week5.day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicateNumber {
public static void main(String[] args) {
	int[] num= {1,2,3,6,9,2,7,1,6,7};
	//duplicate number 1,2,6,7
	
	//create an empty set
	Set<Integer> values=new TreeSet<Integer>(); 
	
	for (int i = 0; i < num.length; i++) {
		
		if(!values.add(num[i])) {
			System.out.println(num[i]);
		}
	}
	//System.out.println(values);

	
}
}
