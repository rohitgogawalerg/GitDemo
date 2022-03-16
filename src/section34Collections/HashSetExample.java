package section34Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	//HashSet,LinkedSet,TreeSet implements Set interface
	//Cannot contains duplicate value
	//There is no guarantee elements stored in sequential order. Random order 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("INDIA");
		hs.add("INDIA");      //it will not consider as new entry.
		hs.add("He");
		hs.add("She");
		System.out.println(hs);
		
		//System.out.println(hs.remove("UK"));
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());

		//To iterate in HashSet
		Iterator<String> it = hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
