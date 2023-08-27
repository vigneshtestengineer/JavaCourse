package Day4;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		
//		int a[]=new int[5];  // Declared array with size 5 , Starting index value is 0and ending is 4
//		
//		// Storing or Inserting values into array
//		
//		a[0]=100;
//		a[1]=200;
//		a[2]=300;
//		a[3]=400;
//		a[4]=500;
		
		int a[]= {100,200,300,400,500,600};  // Declared without size
		
//		System.out.println(a.length);  //To find the length of an array
		
//		System.out.println(a[2]); // Read specific array value
		
//		for (int i = 0; i < a.length; i++) {  // This is for dynamically read the array values
//			
//			System.out.println(a[i]);
//			
//		}
		
		// Read values using enhanced for loop
		
		for (int i:a) {
			System.out.println(i);
		}

	}

}
