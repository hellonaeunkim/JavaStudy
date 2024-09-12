package first;

public class TypeCasting {

	public static void main(String[] args) {

//		자동 (묵시적) 형변환 (Promotion)
		
		int intType = 12345;
		long longType = intType;
		System.out.println(longType);
		

//		강제 형변환 (Casting)
		
		long longType2 = 1;
		int intType2 = (int) longType2;
		System.out.println(intType2);
		

	}

}
