package week3.day1;

public class LearnReplaceAll {
public static void main(String[] args) {
	String text="ABCD78mjdkbas23uen23";
	
	//String replace=text.replaceAll("[^0-9]", "");
	
	String replace=text.replaceAll("[^a-zA-z]", "");
	
	System.out.println(replace);
}
}
