package week5.day5;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueWords {
public static void main(String[] args) {
	String text = "We learn java basics as part of java sessions in  week1 We learn";
	//Secrete the sentence in to words
	
	String[] split = text.split("\\s+");
	
	//create  empty set
	Set<String> words=new LinkedHashSet<String>();
	
	//Iterate the values from split Array
	for (String unique : split) {
		//add  the words in set
		words.add(unique);
	}
	System.out.println(words);
}
}
