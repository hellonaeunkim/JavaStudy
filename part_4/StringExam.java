package part_4;

public class StringExam {

	public static void main(String[] args) {
		
		// Can create object without new
		
		String str1 = "hello"; // "hello" created as a constant
		String str2 = "hello"; // So, str1 and str2 reference same "hello"
		
		
		// If using new, create new instance
		
		String str3 = new String("hello"); // str3 and str4 is reference a different instance
		String str4 = new String("hello");
		
		// Comparing the reference of two variables
		
		if(str1 == str2)
			System.out.println("str1 is smae reference as str2.");
		if(str1 == str3)
			System.out.println("str1 is smae reference as str3.");
		if(str3 == str4)
			System.out.println("str3 is smae reference as str4.");
		
		System.out.println(str1);
		System.out.println(str1.substring(3));
		System.out.println(str1); // Once created, the values in String Class does not change.
		
		// Comparing values stored in variables
		
		if( str3.equals(str4) ){
            System.out.println("str3 and str4 have the same value.");
        }
        else{
            System.out.println("str3 and str4 have different values.");
        }

	}

}
