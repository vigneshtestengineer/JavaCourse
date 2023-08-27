package JavaLearn;

public class BreakCondition {

	public static void main(String[] args) {
		
		
		for (int i = 0; i<=10; i++) {
			
			if (i==7) {
				
				break;
				
			}
			
			System.out.println(i);
			
		}
		
		
		System.out.println("--------------------------------------------------------------------------------------------------");
		
		// From this continue condition the condition true value only does not print without this continue to another numbers
		
for (int j = 0; j<=10; j++) {
			
			if (j==3) {
				
				continue;
				
			}
			
			System.out.println(j);
			
		}
System.out.println("--------------------------------------------------------------------------------------------------");
for (int m = 0; m<=10; m++) {
	
	if (m==3 || m==0 || m==10) {
		
		continue;
		
	}
	
	System.out.println(m);
	
}
System.out.println("--------------------------------------------------------------------------------------------------");
	}

}
