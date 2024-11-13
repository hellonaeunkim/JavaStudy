package part_013;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class ByteExam2 {

	public static void main(String[] args) {
		try(
				DataOutputStream out = new DataOutputStream(new FileOutputStream("data.txt"));
				){
			out.writeInt(100); // 4 byte
			out.writeBoolean(true); // 1 byte
			out.writeDouble(50.5); // 8 byte
			
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}

/*

* try-with-resource 
1. 사용한 자원을 자동으로 종료 시켜주는 기능
2. try의 뒤에나오는 괄호()사이에서 만든 stream은 별도로 close하지 않아도 된다.

* DataOutStream Class
1. 다양한 타입 출력 가능 
2. DataOutput 인터페이스를 구현, 데이터를 읽고 쓰는데 있어서 byte단위가 아닌, 8가지 기본 자료형의 단위로 읽고 쓸 수 있다

*/