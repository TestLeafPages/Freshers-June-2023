package week5.day4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class PrintValues2 {
public static void main(String[] args) {
	
	int[] num= {10,120,300,400,20,500};
	List<Integer> number=new LinkedList<>();
	
	
	for(int i=0;i<num.length;i++) {
		number.add(num[i]);
	}
	Collections.sort(number);
	System.out.println(number);
	
}
}
