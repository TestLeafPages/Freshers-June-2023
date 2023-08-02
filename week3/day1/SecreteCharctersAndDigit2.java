package week3.day1;

public class SecreteCharctersAndDigit2 {
public static void main(String[] args) {
	String text="gmail1234leaf";
 
	//Split the String into characters
	char[] charArray = text.toCharArray();

	for (int i = 0; i < charArray.length; i++) {
		
		if(Character.isDigit(charArray[i])) {
			System.out.print(charArray[i]);
		}	}
System.out.println();
for (int i = 0; i < charArray.length; i++) {
	if(Character.isAlphabetic(charArray[i])) {
		System.out.print(charArray[i]);
	}
}



}
}
