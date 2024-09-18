package part_4;


public class Method {
		
		// Method : Actions of objects in a class (ex. forward, backward)
		// Like as funtion in math.
		// Parameter or Argument -> Method -> Return values.
		
		// public ReturnType MethodName (Parameters) { Methods }
		
		// #1 No ReturnType, No Parameter
		public void method1 () {
			System.out.println("m1이 실행됨");
		}
		
		// #2 No ReturnType, int Parameter
		public void method2 (int x) {
			System.out.println(x + "를 이용한 m2 실행");
		}
		
		// #3 ReturnType, No Parameters
		public int method3 () {
			System.out.println("m3 실행");
			return 10;
		}
		
		// #4 No ReternType, Parameters
		public void method4(int x, int y) {
			System.out.println(x + y +"m4 실행");
		}
		
		// #5 ReturnType, Parameter
		public int method5 (int y) {
			System.out.println(y + "이용한 m5 실행");
			
			return y * 2;
		}
		
	}


