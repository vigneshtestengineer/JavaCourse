package Day6;

public class ConstructorOverloading {
	
	ConstructorOverloading (int a, int b)
	{
		System.out.println("Method 1 : " + (a+b));
	}
	
	ConstructorOverloading (double a, int b)
	{
		System.out.println("Method 2 : " + (a+b));
	}
	
	ConstructorOverloading (double a, double b)
	{
		System.out.println("Method 3 : " + (a+b));
	}
	
	ConstructorOverloading (int a, int b , int c)
	{
		System.out.println("Method 4 : " + (a+b+c));
	}

	public static void main(String[] args) {
		
		ConstructorOverloading M1 =new ConstructorOverloading(10,50);
		
		ConstructorOverloading M2 =new ConstructorOverloading(10.6,50.5);
		
		ConstructorOverloading M3 =new ConstructorOverloading(10.6,50);
		
		ConstructorOverloading M4 =new ConstructorOverloading(10,50,55);
		
		
		

	}

}
