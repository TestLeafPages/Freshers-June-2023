package week3.day1;

public class LearnSplit {
public static void main(String[] args) {
	String text="I   like chicken      briyani";
	
	//split the sentence into words
	//String[] split = text.split(" ");
	
	String[] split = text.split("\\s+");
	//to get the words count
	System.out.println(split.length);
	//initialize the temp variable as count
	int count=0;
	//Iterate the words from split
	for (int i = 0; i < split.length; i++) {
		System.out.println(split[i]);
		//count=count+1;
		count++;
	}
	System.out.println("Words count "+count);
	
	
	
}
}
