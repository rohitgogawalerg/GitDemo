package section34Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	
	//HashMap is an Key value pair

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(0, "Hello");    //to add in HashMap
		hm.put(1, "GudBye");
		hm.put(42, "Morning");
		hm.put(3, "Evening");
		
		System.out.println(hm);   //to print HashMap
		
		System.out.println(hm.get(42));   //to get particular index data
		hm.remove(42); 					  //to remove particular index data	
		System.out.println(hm.get(42));   
		
		
		//print with Set and iterator 
		Set sn = hm.entrySet();       // it will create set and store it in format like --> 0,Hello at 1st pos ..1,GudBye at 2nd pos
		
		Iterator it = sn.iterator();   //To iterate
		
		while(it.hasNext())
		{
			Map.Entry mp = (Map.Entry)it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
	}

}
