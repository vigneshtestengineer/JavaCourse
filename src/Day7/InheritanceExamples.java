package Day7;

class A
{
	int a;
	void display()
	{
		System.out.println(a);
	}
	}

class B extends A  //B is child class and A is parent class
{
	int b;
	void print()
	{
		System.out.println(b);
	}
	}

class C extends B
{
    int c;
    void show()
    {
    	System.out.println(c);
    }
}

public class InheritanceExamples {

	public static void main(String[] args) {
		
//		A aobj =new A(); // Single inheritance
//		aobj.a=100;
//		aobj.display();
//		
//		B bobj =new B();
//				bobj.a=10;
//		bobj.b=20;
//		
//		bobj.display();
//		bobj.print();
		
		
		C cobj =new C();  // multilevel inheritance
		
		cobj.a=10;
		cobj.b=20;
		cobj.c=30;
		
		cobj.print();
		cobj.display();
		cobj.show();
		
		

	}

}
