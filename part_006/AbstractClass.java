package part_6;

public abstract class AbstractClass { // If even one method is an abstract method, that class is an abstract class.
	
	public abstract void abstractmethodA();
	
	public void abstractmethodB() {
		System.out.println("An abstract class can have both abstract and regular methods");
	}

}

// Data abstraction is the process of hiding certain details and showing only essential information to the user.
// Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
// Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass.
