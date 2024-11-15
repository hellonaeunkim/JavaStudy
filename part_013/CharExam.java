// Reading text from a character-input stream

package part_013;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharExam {

	public static void main(String[] args) {
		
		// Input to the keyboard and output to the console.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // Decorator Pattern
		String line = null; // variable scope으로 인해, try 블럭 이외에서도 사용 가능 하도록함
		
		try {
			line = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(line);

	}

}

/*

* BufferedReader
1. Buffer : a region of memory used to temporarily store data while it's being transferred 
between two locations.
2. Reads text from a character-input stream, buffering characters so as to provide 
for the efficient reading of characters, arrays, and lines.

* Decorator Pattern
1. 객체에 추가적인 요건(기능)을 동적(유연하게 변경 가능)으로 첨가하는 방식 

*/