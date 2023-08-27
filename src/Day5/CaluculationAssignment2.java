package Day5;

public class CaluculationAssignment2 {
	
	// Write a program to demonstrate constructor
	
	int a,b;
	
	CaluculationAssignment2(int num1, int num2)
	{
		a =num1;
		b =num2;
	}
	
	
	void sum()
	{
		System.out.println("Sum of values : " + (a+b));
		
	}


	public static void main(String[] args) {
		
		CaluculationAssignment2 callingmethod =new CaluculationAssignment2(200, 200);
		
	callingmethod.sum();
		
	

	}

}
