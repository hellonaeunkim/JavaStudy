package part_7;

public class InnerClass {
	
	class Cal{
		int value = 0;
		public void plus() {
			value++;
		}
	}

	public static void main(String[] args) {
		InnerClass i = new InnerClass();
		InnerClass.Cal cal = i.new Cal();
		cal.plus();
		System.out.println(cal.value);

	}

}

/*

inner class

1. The purpose of nested classes is to group classes that belong together, 
which makes your code more readable and maintainable.

*/
