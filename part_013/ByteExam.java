package part_013;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteExam {

	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis(); //long 타입의 값으로 현재 시간을 가져옴.
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			 // to read file
			fis = new FileInputStream("src/part_13/ByteExam.java");
			
			// to write file
			fos = new FileOutputStream("byte.txt");
			
			int readCount = -1;
			byte[] buffer = new byte[512];
			while((readCount = fis.read()) != -1){
				fos.write(buffer,0,readCount);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
			
		}finally {
			// fos가 null이 아닌 경우에만 close() 호출
			if (fos != null) {
				try {
					fos.close();
					
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			// fis가 null이 아닌 경우에만 close() 호출
			if (fis != null) {
				try {
					fis.close();
					
				} catch (IOException e) {
					e.printStackTrace();
                }
            }
			long endTime = System.currentTimeMillis();
			System.out.println(endTime-startTime); // running time
			
        }
    }
}

/*
 
* Byte Streams
1. Used to read and write files.

*/