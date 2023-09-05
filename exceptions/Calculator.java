package exceptions;

public class Calculator {
final int a=10;
	public static  void add(){
		System.out.println("Addition");
	}
	public static void main(String[] args) {
		//Calculator obj=new Calculator();
		a=20;
		add();
	}
}
