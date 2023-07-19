package week1.day3;

public class Calculator {
public int addTwoNumber(int a,int b) {
	int c=a+b;
	System.out.println(c);
	return c;
}
public void subTwoNumber(int total,int b) {
	int c=total-b;
	System.out.println(c);
}
public static void main(String[] args) {
	Calculator calc=new Calculator();
	int total =calc.addTwoNumber(50, 50);
	calc.subTwoNumber(total, 25);
}

}
