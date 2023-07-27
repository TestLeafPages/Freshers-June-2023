package week2.day3;

public class LearnJumpStatement {
public static void main(String[] args) {
	
	for (int i = 0; i <= 7; i++) {
		//To skip the current iteration, it will be executing next iteration
		if(i==5) {
			System.out.println("FIVE");
			//continue;
			break;
		}
		System.out.println(i);
	}
}
}
