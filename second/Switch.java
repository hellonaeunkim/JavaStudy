package second;

public class Switch {

	public static void main(String[] args) {
		//switch, case, default, break
		
		int value = 2;
		
		switch(value) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		default :
			System.out.println("Else");

		}
		
		String str = "A";
		
		switch(str) {
		case "A":
			System.out.println("A");
		case "B":
			System.out.println("B");
		}
		
		// case 1: case 2: case 3 ...
		int test = 1;
		
		switch(test) {
		case 1: case 2:
			System.out.println("number");
		}

	}

}
