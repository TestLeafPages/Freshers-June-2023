package week2.day1;

public class SwappingBetweenTwoNumbersWithoutTempVariable {
public static void main(String[] args) {
	int a=50;
	int b=100;

	// 150=  50+100
	a= a+b;

	 //  50=150-100
	b=a-b;

	 //100= 150-50
	a=a-b;
	System.out.println(a);
	System.out.println(b);
}
}
