package week2.day4;

public class LearnArrays {
	public static void main(String[] args) {
		int[] number= {10,20,13,54,97};
		
		int maxValue = Integer.MAX_VALUE;
		System.out.println(maxValue);
		
		for (int i = 0; i < number.length; i++) {
			if(number[i]<maxValue) {
				maxValue=number[i];
			}
		}
		System.out.println(maxValue);
	}

}
