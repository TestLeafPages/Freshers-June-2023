package week3.day1;

public class LearnEqualsMethod2 {
public static void main(String[] args) {
	String text=new String("testleaf");
	String text2=new String("testleaf");
	
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
		System.out.println("using == "+"both are not equal");
	}
	
	
	
}
}
