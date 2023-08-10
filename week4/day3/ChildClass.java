package week4.day3;

public class ChildClass extends ParentClass {
	public void bicycle() {
		System.out.println("Bicycle");
	}

	public static void main(String[] args) {
		ChildClass obj=new ChildClass();
		obj.emptyLand();
		obj.vehicle();
		obj.bicycle();
		
	}
}
