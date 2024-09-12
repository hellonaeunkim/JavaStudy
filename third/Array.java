package third;

public class Array {

	public static void main(String[] args) {

// Array : a data structure that can store a fixed-size sequence of elements of the same data type
// It's a Reference type
		
		// declare an array
		int[] array1 = new int[100];
		
		array1[0] = 50;
		array1[10] = 100;
		
		int[] array2 = new int[] {1,2,3,4};
		
		int[] array3 = {1,2,3,4};
		
		System.out.println(array3[0]);
		
		int value = array3[0];
		
		System.out.println(value);
		System.out.println(array2[2]);
		
	}

}
