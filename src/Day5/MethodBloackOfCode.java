package Day5;

public class MethodBloackOfCode {
	
	int x= 20;
	int y=30;
	
//	void sum() // Case 1 : Not taking parameters and also not return any values
//	{
//		System.out.println(x+y);
//	}
	
//	int sum() // Case 2 : Not taking parameters but return value
//	{
//		return(x+y);
//	}
	
//	void sum(int a, int b) // Case 3 : Taking parameters but not return any values
//	{
//		System.out.println(a+b);
//	}
	
	int sum(int a, int b) // Case 4 : Method is taking parameters and also returning a value
	{
	    return(a+b);
	}
	

	public static void main(String[] args) {
		
		MethodBloackOfCode methods =new MethodBloackOfCode(); // Creating object
		
//		methods.sum(); // Case 1
		
//		System.out.println(methods.sum());  //Case 2
		
//		methods.sum(500, 700); // Case 3
		
		System.out.println(methods.sum(200, 200));  // Case 4
		

	}

}
