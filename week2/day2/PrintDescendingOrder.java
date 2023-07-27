package week2.day2;

import java.util.Arrays;

public class PrintDescendingOrder {
public static void main(String[] args) {
	//Pseudocode:
		int[] values={10,30,20,50,40};
		//1.Sort the Arrays
		Arrays.sort(values);
		System.out.println(Arrays.toString(values));
		//2.Iterate the values using reverse for loop
		  for(int i=values.length-1;i>=0;i--){
		//3.Print the values
		System.out.println(values[i]);
		  }
}
}
