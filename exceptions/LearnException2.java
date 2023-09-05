package exceptions;

import java.util.concurrent.TimeoutException;

import org.openqa.selenium.NoSuchElementException;

public class LearnException2 {
public static void main(String[] args) {
	int a=10;
	int b=0;
	int[] num={1,2,3,4,5};
	try {
		//System.out.println(a/b);
		System.out.println(num[6]);
	}
	finally {
		System.out.println("Program Executed successfully");
	}
	
	
}
}
