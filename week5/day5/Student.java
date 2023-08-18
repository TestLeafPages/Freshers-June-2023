package week5.day5;

public class Student {
 String studentName;
 int studentNunber;
 String studentAddress;
 
   Student() {
	System.out.println("default constructor");
}
   Student(String studentName,int studentNunber,String studentAddress ) {
	   this();
	   System.out.println("Parameterized constructor");
		this.studentName=studentName;
		this.studentNunber=studentNunber;
		this.studentAddress=studentAddress;
	}
 
 public static void main(String[] args) {
	 Student obj=new Student("Mani",101,"Chennai");
	 System.out.println(obj.studentName);
	 System.out.println(obj.studentNunber);
	 System.out.println(obj.studentAddress);
}
	
}
