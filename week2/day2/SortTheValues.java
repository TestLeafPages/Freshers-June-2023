package week2.day2;

import java.util.Arrays;

public class SortTheValues {
public static void main(String[] args) {
	int[] numbers= {10,5,7,9,8,6};
	//5,6,7,8,9,10
	Arrays.sort(numbers);
	
	System.out.println(Arrays.toString(numbers));
//	for (int i = 0; i < numbers.length; i++) {
//		System.out.print(numbers[i]+" ");
//	}
}
}
