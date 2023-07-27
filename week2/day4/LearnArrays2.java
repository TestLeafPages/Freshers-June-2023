package week2.day4;

public class LearnArrays2 {
	public static void main(String[] args) {
		//Array literal
		int[] number= {10,20,13,54,97};
		//Array using new key word
		String[] name=new String[5];
		name[0]="Yogan";
		name[1]="Bala";
		name[2]="Vengat";
		//name[3]="Abilash";
		//name[4]="Gokul";
		
		for (int i = 0; i <= name.length-1; i++) {
			System.out.println(name[i]);
		}
		
		
	}

}
