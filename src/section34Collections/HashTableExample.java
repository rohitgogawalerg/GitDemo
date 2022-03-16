package section34Collections;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<Integer,String> hm = new Hashtable<Integer,String>();
		hm.put(0, "Hello");    //to add in HashMap
		hm.put(1, "GudBye");
		hm.put(42, "Morning");
		hm.put(3, "Evening");
		
		System.out.println(hm);   //to print HashMap
		
		System.out.println(hm.get(42));   //to get particular index data
		hm.remove(42); 					  //to remove particular index data	
		System.out.println(hm.get(42));   
		
		
	}

}
