package week2.day3;

public class PrintDuplicate {
public static void main(String[] args) {
	//input
	int[] num={1,4,5,2,6,2,9,3,5,1};
	//output
	 //1,2,5

	//Iterating the values o to Array length
	for(int i=0;i<num.length;i++){
	   //J loop start from j=i+1
	  for(int j=i+1;j<num.length;j++){
	      //check both the loop , if it is matching 
	        if(num[i]==num[j]){
	       //print the duplicate number
	      System.out.println(num[i]);
	        }
	  }
	}
}
}
