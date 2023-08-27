package Day6;

public class Assignment {
	
	int sum(int x,int y )
	{
		return x+y;
		
	}
	
	int sum(int x, int y, int z)
	{
		return x+y+z;
	}
	
	double sum(double x, double y)
	{
		return x+y;
	}
	

	public static void main(String[] args) {
		
		Assignment cal =new Assignment();
		
		System.out.println(cal.sum(10, 10));
		System.out.println(cal.sum(10.5, 10.5));
		System.out.println(cal.sum(10, 20, 30));
		

	}

}
