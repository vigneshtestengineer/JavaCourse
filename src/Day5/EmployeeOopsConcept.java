package Day5;

public class EmployeeOopsConcept {
	
	
	int empid;
	String empname;
	double salary;
	int depno;
	String job;
	
	void display()   // Void is the return type if method is not return values just denote like this void display()
	
	{  
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(salary);
		System.out.println(depno);
		System.out.println(job);
		
		
	}
	
	

	public static void main(String[] args)
	{
		
		EmployeeOopsConcept emp1 =new EmployeeOopsConcept();
		
		emp1.empid=1555;
		emp1.empname="vignesh";
		emp1.salary=50000;
		emp1.depno=255;
		emp1.job="Engineer";
		
		emp1.display();
		
		
		
		
		

	}

}
