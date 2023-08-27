package Day4;

public class EvenandOddNumber {

	public static void main(String[] args) {
		
		int numbers[] = {122,666,777,78899,46566};
		
		for (int i = 0; i < numbers.length; i++) {
			
			if (numbers[i]%2 !=0) {
				
				System.out.println("Odd numbers : " + numbers[i]);
				
			}
		}
			
			for (int j = 0; j < numbers.length; j++) {
				
				if (numbers[j]%2 ==0) {
					
					System.out.println("Even numbers : " + numbers[j]);
				}
				
			
			
		}

	}

}
