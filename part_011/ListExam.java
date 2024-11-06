package part_11;

import java.util.ArrayList;
import java.util.List;

public class ListExam {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("kim");
		list.add("kang");
		list.add("kim");
		
		System.out.println(list.size());
		
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i); // list의 값을 가져오려면 get 사용
			System.out.println(str);
		}

	}

}

/*

 * List
 1. The List Interface is present in java.util package and extends the Collection interface.
 2. 순서 있고, 중복 허용
 
 * ArrayList
 1. The ArrayList class is a resizable array, which can be found in the java.util package.
 
 */
