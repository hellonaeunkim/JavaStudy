package third;

public class Array2 {

	public static void main(String[] args) {
		
		// Multidimensional Arrays - Two dimensional array
		
		int[][] array4 = new int[3][4]; // [0] 	   [0][10] [0] [0]
		array4[0][1] = 10;				// [1] ->  [0] [0] [0] [0]
										// [2] 	   [0] [0] [0] [0]
		
		int[][] array5 = new int[3][]; // [0]		[10]
		array5[0] = new int[1];		   // [1] ->	[0] [0]
		array5[0][0] = 10;			   // [2]		[0] [0] [0]
		array5[1] = new int[2];
		array5[2] = new int[3];
		
		int[][] array6 = {{1}, {1,2}, {1,2,3}};
		
		System.out.println(array6[0][0]);
		System.out.println(array6[2][2]);
	}

}
