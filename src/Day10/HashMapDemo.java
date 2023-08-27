package Day10;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		
		//Declaration
		
		//HashMap hm=new HashMap();
		
		HashMap <Integer,String> hm =new HashMap <Integer,String> ();
		
		// Adding pairs into hashmap
		
		hm.put(100, "Vignesh");
		hm.put(101, "Nive");
		hm.put(103, "Chakku");
		
//		System.out.println(hm);
//		
//		// Remove a pair from hashmap
//		hm.remove(103);
//		System.out.println("After removed 103" + hm);
//		
//		// Reading pair using for loop
		
		for(Map.Entry m: hm.entrySet())
		{
			System.out.println(m.getValue()+" - "+m.getKey());
		}

	}

}
