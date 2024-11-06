package part_11;

import java.util.*;

public class MapExam {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>(); // map 생성
		
		map.put("001", "kim"); // to add an element key and value in map.
		map.put("002", "lee");
		map.put("003", "choi");
		
		map.put("001", "kang"); // do not allow same keys.
		
		System.out.println(map.size()); // 3
		
		System.out.println(map.get("001")); // "kang", 같은 키에 다른 값을 입력한 경우 새로 들어온 값으로 바꿈. 마지막 입력한 값이 저장됨.
		
		Set<String> keys = map.keySet(); // Set 자료구조에 key만 저장
		
		Iterator<String> iter = keys.iterator(); // Set에 저장된 keys 값 읽기
		while(iter.hasNext()) {
			String key = iter.next();
			String value = map.get(key);
			System.out.println(key + ":" + value);
		}
		

	}

}

/*

* Map
1. Map Interface is present in java.util package represents a mapping between a key and a value.
2. It does not allow duplicate keys.

*/