package Day7;

public class Supermethod1 {
	
	// Super can be used to refer immediate parent class instance variable
	
	String color ="White";
	
	// Super can be used to invoke immediate parent class method
	
	void eating()
	{
		System.out.println("Parent class....");
	}
	
	Supermethod1()
	{
		System.out.println("Parent class constructor");
	}

}

class Dog extends Supermethod1
{
	String color ="Black";
	
	void display()
	{
		System.out.println(color);
		
	// Super can be used to refer immediate parent class instance variable		
		
		System.out.println(super.color); // This super will invoke the immediate parent class

		
	}
	
	// Super can be used to invoke immediate parent class method
	
	void eating()
	{
		System.out.println("Child class....");
		super.eating();
	}
	
	
	Dog()
	{
		super();  // Invokes parent class constructor
		System.out.println("Child class constructor");
	}
	
}
