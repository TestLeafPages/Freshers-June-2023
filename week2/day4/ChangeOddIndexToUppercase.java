package week2.day4;

import java.util.Arrays;

public class ChangeOddIndexToUppercase {
public static void main(String[] args) {
	//Declare a String
	String text="testleaf";

	//testleaf
	//tEsTlEaF

	//Convert the String into character
	char[] charArray=text.toCharArray();
	//[t,e,s,t,l,e,a,f]

	//Iterate the character  from charArray
	for(int i=0; i<charArray.length; i++){
	//check  index value
	    if(i%2==1){
	      //t%2==0
	     //if it is satisfaction that condition 
	    //it will change the character into uppercase
	  char  oddIndex=Character.toUpperCase(charArray[i]);
	  //print the odd index character
	    System.out.print(oddIndex);
	   }
	  else{
		  //print the even character
	 System.out.print(charArray[i]);
	   }
}
}
}