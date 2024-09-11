package second;

public class For {

	public static void main(String[] args) {
		
// for (initialExpression; testExpression; updateExpression)
		
		// sum from 1 to 100
		int total = 0;
		for(int i = 1; i <= 100; i++) {
			total = total + i;
		}
		
		System.out.println(total);
		
		// sum of even numbers
		int even = 0;
		for(int i = 1; i <= 100; i++) {
			
			if(i % 2 != 0) {
				continue; // skip the rest statement 
			}
			
			even = even + i;
		}
		
		System.out.println(even);
		
		// sum of odd numbers
		int odd = 0;
		for(int i = 1; i <= 100; i++) {
			
			odd = odd + i;
			if(i == 50) {
				break; // jump out of a loop 
			}
			
		}
		
		System.out.println(odd);
		

	}

}
