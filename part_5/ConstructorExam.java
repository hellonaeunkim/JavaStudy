package part_5;

import part_4.Car;

public class ConstructorExam {

	public static void main(String[] args) {
		Constructor c1 = new Constructor(); // new Constructor(); -> 생성자(Constructor)
		Constructor c2 = new Constructor("소방차"); // class Constructor에서 기본 생성자 매개변수로 String값을 받음
		Constructor c3 = new Constructor("구급차");
		
		System.out.println(c2.name);

	}

}
