package week7.day5;

public class ArmStrongNumber {
public static void main(String[] args) {
	
	int number=153;
	int sum=0;
	int result=number;
			
	//1*1*1=1
	//5*5*5=125
	//3*3*3=27
	//153
	while(number>0) {
	int remainder=number%10;
	
	 sum=sum+(remainder*remainder*remainder);
	System.out.println(sum);
	 number=number/10;
}
	if(sum==result) {
		System.out.println("The given number is ArmStrongNumber");
	}else {
		System.out.println("The given number is not ArmStrongNumber");
	}
	
	System.exit(0);
}
}
