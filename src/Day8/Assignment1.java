package Day8;

interface B
{
	int a=10;
	int b=20;
	
	 default void sum()
	{
		System.out.println(a+b);
	}
}

public class Assignment1 implements B {

	public static void main(String[] args) {
		
		B inter =new Assignment1();
		
		inter.sum();
		
		

	}

}
