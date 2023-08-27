package Day5;


public class Student {	
	int sid;
	String sname;
	char grade;
	
	// 1) This is the CONSTRACTOR
	// 2) This not able to call for main class once we create the object in main class it will automatically called so we don't need to call this constractor
	
	Student(int id, String name, char g) 
	{
		sid=id;
		sname=name;
		grade=g;
	}
	
	
	// This is the getvalues methods means from this we can get the values in the parameters from main class
//	void getValues(int id, String name, char g)  // This is the METHIOD
//	{
//		sid=id;
//		sname=name;
//		grade=g;
//	}
	
	void display()
	{
		System.out.println(sid + "     " + sname + "      " + grade);
	}

}
