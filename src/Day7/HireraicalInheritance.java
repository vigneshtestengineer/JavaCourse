package Day7;

class Parent
{
	int a;
	void print()
	{
		System.out.println(a);
	}
}

class Child1 extends Parent
{
	int x;
	void show()
	{
		System.out.println(x);
	}
}

class Child2 extends Parent
{
	int y;
	void display()
	{
		System.out.println(y);
	}
}

public class HireraicalInheritance {

	public static void main(String[] args) {
		
//		Child1 c1 =new Child1();
//		c1.a=100;
//		c1.x=200;
//		c1.show();
//		c1.print();
		
		Child2 c2=new Child2();
		c2.a=7;
		c2.y=10;
		c2.display();
		c2.print();

	}

}
