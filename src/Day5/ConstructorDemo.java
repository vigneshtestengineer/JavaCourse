package Day5;

public class ConstructorDemo {
	
	int x;
	int y;
	
	ConstructorDemo() // default constructor
	{
		x=10;
		y=10;
	}
	
	ConstructorDemo(int a, int b) // Parameterized constructor
	{
		x=a;
		y=b;
	}
	
	void display()
	{
		System.out.println((x*y)/x);
	}

	public static void main(String[] args) {
		
		ConstructorDemo con1 = new ConstructorDemo();  // Invokes default constructor
		
		ConstructorDemo con2 = new ConstructorDemo(100, 200); // Invokes Parameterized constructor
		
		
		con1.display();
		con2.display();
	

	}

}
