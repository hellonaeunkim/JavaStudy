package part_11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setExam {

	public static void main(String[] args) {
		
		Set<String> set1 = new HashSet<>();
		boolean flag1 = set1.add("kang"); // set에 값을 넣고 싶을 때, add 사용
		boolean flag2 = set1.add("kim");
		boolean flag3 = set1.add("kang");
		
		System.out.println(set1.size()); // 2
		
		System.out.println(flag1);
		System.out.println(flag2);
		System.out.println(flag3); // false
		
		Iterator<String> iter = set1.iterator();
		while(iter.hasNext()) {
			String str = iter.next();
			System.out.println(str);
		}

	}

}

/*

 * Set
 1. The Set Interface is present in java.util package and extends the Collection interface.
 2. It is an unordered collection of objects in which duplicate values cannot be stored.
 3. Set is an interface, objects cannot be created.
 
 * Iterator
 1. Set처럼 인덱스가 없는 자료구조의 경우에 iterator를 활용하여 내부 데이터를 확인하거나 제거할 수 있다.
 
 */