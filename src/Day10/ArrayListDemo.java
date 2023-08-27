package Day10;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		// How to Declare array list
		
		ArrayList list =new ArrayList(); // We can store any type of elemets

//		ArrayList <Integer> list =new ArrayList <Integer>(); // We can store integer values only
		
//		ArrayList <String> list =new ArrayList <String>();
		
		// Adding values to arraylist
		
		list.add("John");  //0
		list.add("David"); //1
		list.add("Vignesh"); //2
		list.add("Mani"); //3
		list.add(100);
		
		// Size of Array list
		
		System.out.println(list.size());  // Return 4
		
		// Remove an element
		
		list.remove(2);  // Removed Vignesh
		System.out.println(list.size());  // Return 3
		System.out.println("After removed the 2nd values" + list);
		
		
		// Inserting a new element into array list
		
		list.add(2, "KV");
		
		System.out.println("After Inserting the new values" + list);
		System.out.println(list.size());
		
		// Read values from array list using for loop
		
		for(Object s:list)  // Object type variable can hold any type of values
		{
			System.out.println(s);
		}
		
		
		
		
		
	}

}
