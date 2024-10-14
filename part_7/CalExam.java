package part_7;

public class CalExam {

	public static void main(String[] args) {
		
		Calculator cal = new CalClass();
		
		cal.plus(3, 4);
		int i = cal.minus(5, 4);
		System.out.println(i);
		
		Calculator.minus2(6, 2);

	}

}
