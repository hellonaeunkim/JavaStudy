package second;

public class While {

	public static void main(String[] args) {
		int i =0;
		
		while(i<10) {
			System.out.println(i);
			i++; // i = i + 1;
		}
		
		int j = 1;
		int total = 0;
		while(j<=100) {
			total = total + j;
			j++;
		}
		
		System.out.println(total);

	}

}
