package Day8;

class A1
{
	int x=100;
	void m1()
	{
		System.out.println(x);
	}
}

interface B1
{
	int y=200;
      default void m2()
	{
		System.out.println(y);
	}
}

interface C1
{
	int z=300;
	default void m3()
	{
		System.out.println(z);
	}
}



public class HybridInheritance extends A1 implements B1,C1

{

	public static void main(String[] args) {
		
		HybridInheritance HI =new HybridInheritance();
		
		HI.m1();
		HI.m2();
		HI.m3();

	}

}
