package exceptions;

public class LearnData {
public static void main(String[] args) {
	int a=10;
	int b=0;
	int[] num={1,2,3,4,5};
	try {
		System.out.println(a);
		try {
			System.out.println(num[5]);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("Program Executed successfully");
}
}
