package Day4;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		
		
		int a[][] =new int[3][2];  // 3 Row and 2 Column
		
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;
		
		
//		int a[][]= {{100,200},{300,400},{500,600},{800,900}};
		
		System.out.println("Number of Rows: " +a.length);
		System.out.println("Number of Column : " + a[0].length);
		
//		for(int i=0;i<a.length;i++)   // Outer loop   a.length = 3
//		{
//			for(int j=0;j<a[i].length;j++)     // Inner loop  a[i].length = 2  it will represent the length of the 2 row columns
//			{   
//				System.out.println(a[i][j]);
//			}
//		}
		
		// ENHANCED FOR LOOP
		
		for(int r[]:a)  
// First take (a) as 1st row and this will assigned to (r) in single dimensional array 
// After taken 2 values from 1st row for (i) then (a) assign the 2nd row values to (r) in single dim array this will continue upto last row			
		{
			for(int i:r) 
// In (r) there are 2 values in single dimensional array then it will first take 1st value as 100 from (r) to assign to (i)	then check is there any other value is there in (r)
				
			
			{
				System.out.println(i);
			}
			}
		}
		
		

	}


