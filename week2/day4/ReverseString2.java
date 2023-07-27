package week2.day4;

import java.util.Arrays;

public class ReverseString2 {
public static void main(String[] args) {
	String text="Testleaf";
	//to get the size of given String
	int length = text.length();
	
	System.out.println(length);
	//Convert the String into character
	char[] charArray = text.toCharArray();
	//Iterate the values from char Array
	for (int i =charArray.length-1;i>=0; i--) {
		//Print the character
		System.out.print(charArray[i]);
	}
	
//	int[] number= {10,20,13,54,97};
//	int length2 = number.length;
	
	
}
}
