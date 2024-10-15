package part_7;

public class InnerClass3 { // local
	
	public void method(){
		class Cal{
			int value = 0;
			public void plus() {
				value++;
			}
		}
		Cal cal = new Cal();
		cal.plus();
		System.out.println(cal.value);
	}

	public static void main(String[] args) {
		InnerClass3 i = new InnerClass3();
		i.method();

	}

}
