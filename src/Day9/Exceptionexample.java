package Day9;

public class Exceptionexample {

	public static void main(String[] args) {
		
		// Arithmetic Exception
		
		
		System.out.println("Program is started");
		System.out.println("Program is Inprogress");
		
		int a=100;
		
		System.out.println(a/0);
		
		System.out.println("Program is ended");
		
		// NullPointerException
		
		String s=null;
		System.out.println(s.length());
		
		
		// NumberFormatException
		
		String K ="abc";
		int i=Integer.parseInt(K);
		
		// ArrayIndexOutofBounds
		
		int p[]=new int[5];
		p[10]=50;

	}
	

}
