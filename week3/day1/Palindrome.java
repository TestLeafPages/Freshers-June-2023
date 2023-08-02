package week3.day1;

public class Palindrome {
public static void main(String[] args) {
	//Declare a String
	String text="malayalam";

	//Initialize the temp string as rev
	String rev=" ";

	//convert the string into chaRACTER
	char[] charArray=text.toCharArray();

	//iterate the character using reverse for loop
	for(int i=charArray.length-1;i>=0;i--){

	   rev=rev+ charArray[i];
	}
	System.out.println(rev);
	//to compare the both string
	//if it is match the given String is palindrome
	if(text.equals(rev)) {
		System.out.println("Palindrome");
	}else {
		System.out.println("not  Palindrome");
	}
}

}