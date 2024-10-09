package part_6;

public class OverridingChild extends Overriding {
	
	public void overriding() {
		
		super.overriding(); // can use both parent's and child's method.
		
		System.out.println("Child's Method"); // Declaring a method in the subclass which already exists there in the parent class.
	}

}
