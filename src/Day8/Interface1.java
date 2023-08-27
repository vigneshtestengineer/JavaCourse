package Day8;

interface A
{
	int a=10; // by default variables i interface are static and final
	
	void m1();  // abstract method , by default public (This is because of method written under the interface)
}

public class Interface1 implements A

{
	public void m1()  // if we don't denote access modifier it will take default ,so showing error we need to denote public
	{
		System.out.println(a);
	}


	public static void main(String[] args) {
		
//		Interface1 I =new Interface1();
//		
//		I.m1();
		
		// Also write like this
		
		A a =new Interface1();
		
		a.m1();
		
	}

}
