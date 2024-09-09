package second;

public class If {

	public static void main(String[] args) {
		
		int x = 50;
		int y = 60;
		
		if(x < y) {
			System.out.println("x는 y보다 작습니다.");
		}
		if(x > y) {
			System.out.println("x는 y보다 큽니다.");
		}
		
		if(x == y)
			System.out.println("x와 y는 같습니다."); // {}가 없을 때는 if가 참일 때 한줄만 실행
			
		System.out.println("test");
		
		if (x == y) {
			System.out.println("x는 y와 같습니다.");	
		}else if(x < y) {
			System.out.println("x는 y보다 작습니다.");
		}else {
			System.out.println("x와 y는 다릅니다.");
		}

	}

}
