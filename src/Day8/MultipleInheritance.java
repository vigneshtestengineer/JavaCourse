package Day8;

interface ABC
{
	int x=100;
	void m1();
}

interface XYZ
{
	int y=200;
	void m2();
}

public class MultipleInheritance implements ABC,XYZ

{
	
	public void m1()
	{
		System.out.println(x);
	}
	
	public void m2()
	{
		System.out.println(y);
	}

	public static void main(String[] args) {
		
		MultipleInheritance MI =new MultipleInheritance();
		
		MI.m1();
		MI.m2();
		

	}

}
