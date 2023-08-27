package Day5;

public class Assignment1 {
	
	// Creat a student class contains the following variables and methods
	
	int SID;
	String Sname;
	int Sub1;
	int Sub2;
	int Sub3;

	
	void getStdData(int id, String Name)
	{
		SID = id;
		Sname= Name;
	}
	
	
	void getStdMarks(int s1, int s2, int s3)
	{
		Sub1=s1;
		Sub2=s2;
		Sub3=s3;
	}
	
	void getTotalMarks()
	{
		int total =Sub1+Sub2+Sub3;
		
		System.out.println("Student details : " + SID + ", " +  Sname);
		System.out.println("Student marks : " + Sub1 + ", " + Sub2 + ", " + Sub3);
		System.out.println("Total marks : " + total);
		
	}
	
	
	public static void main(String[] args) {
	
		Assignment1 stu =new Assignment1();
		
		stu.getStdData(100, "Vignesh");
		stu.getStdMarks(500,499, 500);
		stu.getTotalMarks();

	}

}
