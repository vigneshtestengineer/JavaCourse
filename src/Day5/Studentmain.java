package Day5;

public class Studentmain {

	public static void main(String[] args) {
		
		Student std1 =new Student(1005, "vignesh", 'c');  // 3)  This parameter should be passed in object for the contractor
		
		// 1) Assign values by using reference variable
		
//		std1.sid=1122;
//		std1.sname="Kay";
//		std1.grade='A';
		
		
		// 2) Assign values by using METHODS
		
//		std1.getValues(1021, "vignesh", 'A');
		
		std1.display();

	}

}
