package week3.day1;

public class LearnSplit2 {
public static void main(String[] args) {
	String text="Amazon has 20,000 employees in chennai";
	//Secrete the sentence into words
	String[] split = text.split(" ");
	
	//print only digit
	String replaceAll = text.replaceAll("[^0-9]", "");
	System.out.println(replaceAll);
	
	//iterate the words from split
	for (int i = 0; i < split.length; i++) {
		//print the words
		System.out.println(split[i]);
	}
}
}
