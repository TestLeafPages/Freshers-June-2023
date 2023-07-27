package week2.day2;

public class LearnArray {
public static void main(String[] args) {
	
	int[] num= {1,2,3,4,5,6};
	
	//get the array size
	int len = num.length;
	System.out.println(len);
	
	//          0         6
	for (int i = 0; i < num.length; i++) {
		System.out.println(num[i]);
	}
	
	System.out.println("last index "+num[len-3]);
}
}
