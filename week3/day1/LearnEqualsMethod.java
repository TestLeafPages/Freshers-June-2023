package week3.day1;

public class LearnEqualsMethod {
public static void main(String[] args) {
	String text="testleaf";
	String text2="testleaf";
	
	boolean equals = text.equals(text2);
	System.out.println(equals);
	if(text.equals(text2)) {
		System.out.println("both are equal");
	}else {
		System.out.println("both are not equal");
	}
	if(text==text2) {
		System.out.println("both are equal");
	}else {
		System.out.println("both are not equal");
	}
	
	
	
}
}
