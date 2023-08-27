package Day9;

public class FinallyCatchstatement {

	public static void main(String[] args) {
		
		//1. Exception doesn't occur
		//2. Exception occurs and not handled
		//3. Exception occurs and handled
		
		System.out.println("Program start");
		
		int a=100;
		
		try {
			System.out.println(a/0);
		} catch (NullPointerException e) {
			System.out.println("Inside the catch statement");
		}
		finally {
			System.out.println("Inside the finally");
		}
		
		System.out.println("Program exited");

	}

}
