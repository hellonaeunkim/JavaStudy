package part_4;

public class CarExam {

	public static void main(String[] args) {
		Car c1 = new Car(); //instance
		Car c2 = new Car();
		
		c1.name = "소방차";
		c1.number = 1234;
		
		c2.name = "구급차";
		c2.number = 5678;
		
		System.out.println(c1.name);
		System.out.println(c1.number);
		System.out.println(c2.name);
		System.out.println(c2.number);

	}

}
