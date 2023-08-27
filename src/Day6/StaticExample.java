package Day6;

public class StaticExample {
	
	static int a=10;
	int b=20;
	
	static void m1()
	{
		System.out.println("This is static method");
	}
	
	void m2()
	{
		System.out.println("This is Non static method");
	}
	
	void m3()  // Non static is access with or without object creation
	{
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}
	

	public static void main(String[] args) {
		// Static methods can access only static stuff
		
		// For static without creating object allow to access in static method
		
		System.out.println(a);
		m1();
		
		
		// If main class is in another class then try like this
		
		System.out.println(StaticExample.a);
		StaticExample.m1();
		
		// Static method can also access non static method using object
		
		StaticExample nonstatic =new StaticExample();
		
		System.out.println(nonstatic.b);
		nonstatic.m2();
		

	}

}
