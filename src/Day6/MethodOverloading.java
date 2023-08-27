package Day6;

public class MethodOverloading {
	
	void add(int a, int b)
	{
		System.out.println("Method 1 : " + (a+b));
	}
	
	void add(int a, double b)
	{
		System.out.println("Method 2 : " + (a+b));
	}
	
	void add(double a, double b)
	{
		System.out.println("Method 3 : " + (a+b));
	}
	
	void add(int a, int b, int c)
	{
		System.out.println("Method 4 : " + (a+b));
	}

	public static void main(String[] args) {
		
		MethodOverloading mo =new MethodOverloading();
		
		mo.add(20, 20, 20);
		
		mo.add(50.55,10.05);
		
		mo.add(2, 0);
		
		mo.add(5, 10.5);
		

	}

}
