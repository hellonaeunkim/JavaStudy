package second;

import java.util.Scanner; // 사용자로부터 값을 입력받기 위한 클래스 

public class DoWhile {

	public static void main(String[] args) {
		int value = 0;
		Scanner scan = new Scanner(System.in); // 키보드로부터 값을 입력받는 Scanner 클래스 
		do {
			//반복할 문장들 
			value = scan.nextInt(); // int(정수) 값 입력 받음
			System.out.println("Input : " + value);
		}while(value != 10);
		
		System.out.println("Exit While Loop");

	}

}
