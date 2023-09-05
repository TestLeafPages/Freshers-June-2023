package exceptions;

import java.util.concurrent.TimeoutException;

import org.openqa.selenium.NoSuchElementException;

public class LearnException {
public static void main(String[] args) {
	int a=10;
	int b=0;
	int[] num={1,2,3,4,5};
	try {
		//System.out.println(a/b);
		System.out.println(num[6]);
	} catch (ArithmeticException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	catch (ArrayIndexOutOfBoundsException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	catch (NoSuchElementException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Program Executed successfully");
}
}
