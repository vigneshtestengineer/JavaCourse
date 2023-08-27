package Day6;

public class ThisKeyword {
	
	int a,b;  // Instance variable or class variables
	
	void getvalues(int a, int b) // Method variables or external variables
	{
		this.a=a; // this will represent this is the class variable if we don't gave "this" means it will logically wrong
	
		this.b=b;  // So we can reduce the different variables so we denote same variables with "this" method
	}   // "this" keyword always mention class variable
	
	// EG : if a belongs to a class
	
	void printvalues()
	{
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		ThisKeyword th =new ThisKeyword();
		th.getvalues(500, 400);
		th.printvalues();

	}

}
