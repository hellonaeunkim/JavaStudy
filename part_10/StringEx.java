package part_10;

public class StringEx {
	
	public static void main(String[] args) {
		String str1 = "hello world";
		String str2 = str1.substring(5);
		System.out.println(str1);
		System.out.println(str2);
		
		String str3 = str1 + str2;
		System.out.println(str3);
		
		String str4 = new StringBuffer().append(str1).append(str2).toString();
		System.out.println(str4);
		// 문자열을 더하는 것은 내부적으로 위와 같이 StringBuffer() 객체를 만든다.
		
		String str5 = "";
		for(int i = 0; i < 100; i++) {
			str5 = str5 + "*";
		}
		System.out.println(str5);
		// 반복문에서 문자열을 더할경우 내부적으로 계속해서 String 객체를 만들게 된다. 이 경우 실행되는 속도가 느려져 성능이 떨어지므로, StringBuffer() 객체를 만드는 것이 좋다.
		
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < 100; i++) {
			sb.append("*");
		}
		String str6 = sb.toString();
		System.out.println(str6);
	}

}

/* 

* substring() 

1. The substring() method returns a substring from the string
2. substring(int start, int end)
3. If the end argument is not specified then the substring will end at the end of the string.

*/