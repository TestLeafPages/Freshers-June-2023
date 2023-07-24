package week2.day1;

public class SwappingBetweenTwoNumbersWithTempVariable {
public static void main(String[] args) {
	int a=50;
	int b=100;
//Initialize the temp variable as c
	int c=a;
	c=50;
	//Assign the b values in a
	a=b;
	//Assign the c values in b
	b=c;
	System.out.println(a);
	System.out.println(b);
}
}
