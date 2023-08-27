package Day6;

public class OverloadingMainmethod {
	
	public void main(int x)
	{
		System.out.println("Method 1 : " + x);
	}
	
	public void main(int x , int y)
	{
		System.out.println("Method 2 : " + (x+y));
	}
	

	public static void main(String[] args) {
		
		OverloadingMainmethod mo =new OverloadingMainmethod ();
		
		mo.main(7);
		mo.main(88, 0);
				

	}

}
