package week1.day3;

public class StudentDetails {

	public void getStudentName(String name) {
		System.out.println("Student name "+name);
	}
	public void getStudentNumber(long number) {
		System.out.println("Student Number "+number);
	}
	public void getStudentAddress(String address) {
		System.out.println("Student Address "+address);
	}
	public static void main(String[] args) {
		StudentDetails details=new StudentDetails();
		details.getStudentName("Mani");
		details.getStudentNumber(872362383263232L);
		details.getStudentAddress("Chennai");
		StudentDetails details2=new StudentDetails();
		details2.getStudentName("Kani");
		details2.getStudentNumber(872363263232L);
		details2.getStudentAddress("Trichy");
		StudentDetails details3=new StudentDetails();
		details3.getStudentName("Kavi");
		details3.getStudentNumber(865434234986L);
		details3.getStudentAddress("Madurai");
		
	}
}
