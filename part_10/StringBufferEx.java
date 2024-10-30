package part_10;

public class StringBufferEx {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		sb.append(" ");
		sb.append("world");
		
		String str = sb.toString();
		System.out.println(str);
		
		StringBuffer sb2 = new StringBuffer();
		StringBuffer sb3 = sb2.append("hello");
		if(sb2 == sb3)
			System.out.println("sb2 == sb3"); // Method Chaining : 자기자신을 리턴하여 계속해서 자신의 메소드를 호출하는 방식
		
		String str2 = new StringBuffer().append("hello").append(" ").append("world").toString();
		System.out.println(str2);
	}

}

/*

* StringBuffer Class

1. StringBuffer objects are mutable, meaning that you can change the contents of the buffer without creating a new object.
2. 버퍼(buffer) : An independent space that exists inside the StringBuffer class.

*/