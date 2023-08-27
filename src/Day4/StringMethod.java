package Day4;

public class StringMethod {

	public static void main(String[] args) {
		
		String s= "Welcome";
		String s1="to java";
		
		System.out.println("Length of the String is : " + s.length());
		
		System.out.println("Concotinating the 2 strings : " + s.concat(s1));
		
		s="        Java Program       ";
		
		System.out.println("Before triming : " + s);
		
		System.out.println("After triming : " + s.trim());
		
		
		//charAt()
		s= "Welcom8";
		System.out.println(s.charAt(0)); //Return char based on index number
		
		System.out.println(s.contains("Wel"));
		
		System.out.println(s.endsWith("e"));
		
		if (s.endsWith("e")) {
			
			System.out.println(s);
			
		}else {
			System.out.println("Not ended with : ");
		}
		
		System.out.println(s.subSequence(6, 7));
		
		
		
	}

}
