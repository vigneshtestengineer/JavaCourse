package Day8;

interface V
{
	int a=10;
	int b=20;
	
	void add();
}

interface N
{
	int c=10;
	int d=20;
	
	void multiple();
}

public class Assignment2 implements V,N{
	
	public void add()
	{
		System.out.println(a+b);
	}
	
	public void multiple()
	{
		System.out.println(c*d);
	}

	public static void main(String[] args) {
		
		Assignment2 cal =new Assignment2();
		
		cal.add();
		cal.multiple();

	}

}
