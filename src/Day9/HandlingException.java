package Day9;

public class HandlingException {

	public static void main(String[] args) {
		
		// One try block can have multiple catch blocks
		
		
		System.out.println("Program is started");
		System.out.println("Program is Inprogress");
		
		int a=100;
		try
		{
		System.out.println(a/0);
		}
		catch(ArithmeticException r)
		{
			System.out.println("Catch statement");
		}
		
		System.out.println("After try catch statement");
		
		
		int res=0;
		
		try {
			res =a/0;
		} catch (Exception e) {
			System.out.println("Catches");
		}
		
		System.out.println(res);

	}

}
