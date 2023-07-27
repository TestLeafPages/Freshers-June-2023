package week2.day3;

import java.util.Arrays;

public class FindSecondLargestNumber {
public static void main(String[] args) {
	//Pseudo Code:
	// Here is the input
			int[] data = {3,2,11,4,6,7};

			// 1) Arrange the array in ascending order
			Arrays.sort(data);
			
			//[2, 3, 4, 6, 7, 11]
	//index    0,1,  2,  3, 4, 5		
			
			System.out.println(Arrays.toString(data));
			// 2) Pick the 2nd element from the last and print it
			System.out.println(data[data.length-2]);
			
			
}
}
