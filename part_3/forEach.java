package part_3;

public class forEach {

	public static void main(String[] args) {
		int[] iarr = {10,20,30,40,50};
		
		for(int i = 0; i < iarr.length; i++) {
			int value = iarr[i];
			System.out.println(value);
		}
		
		//for-each Loop -> for(type variableName : arrayName
		for(int value:iarr) {
			System.out.println(value);
		}

	}

}
