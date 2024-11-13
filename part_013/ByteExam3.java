package part_013;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class ByteExam3 {

	public static void main(String[] args) {
		
		try(
				DataInputStream in = new DataInputStream(new FileInputStream("data.txt"));
				){
			int i = in.readInt();
			boolean b = in.readBoolean();
			double d = in.readDouble();
			
			System.out.println(i);
			System.out.println(b);
			System.out.println(d);
			
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}

/*

* DataInputStream Class
1. 다양한 타입 입력 가능
2. DataInput 인터페이스를 구현, 데이터를 읽고 쓰는데 있어서 byte단위가 아닌, 8가지 기본 자료형의 단위로 읽고 쓸 수 있다

*/