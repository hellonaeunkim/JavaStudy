// Reading text from a file by character (as strings) and writes it to another file using buffered I/O.

package part_013;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CharExam2 {

	public static void main(String[] args) {
		
		// Input from the file and output to the console.
		
		BufferedReader br = null;
		PrintWriter pw = null; // for output
				
				try {
					br = new BufferedReader(new FileReader("src/part_13/CharExam2.java")); // input from file
					pw = new PrintWriter(new FileWriter("test.txt"));
					
					String line = null;
					while((line = br.readLine()) != null) { // 파일의 끝이 되면 null값이 return
						pw.println(line); // 읽어온 값 출력 
					}
				} catch (Exception e) {
					e.printStackTrace();
				}finally { // io에서는 파일을 열었으면 닫아주는 것이 좋다.
					
					pw.close();
					try {
						br.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}

	}

}
