package week3.day1;

public class SecreteCharctersAndDigit {
public static void main(String[] args) {
	String text="gmail1234leaf";
	//Replace the letters using replaceAll medthod
	String replaceAll = text.replaceAll("[^0-9]", "");
	//print digit
	System.out.println(replaceAll);
	
	//Replace the digit using replaceAll medthod
		String replaceAll2 = text.replaceAll("[^a-z]", "");
		//print letters
		System.out.println(replaceAll2);
}
}
