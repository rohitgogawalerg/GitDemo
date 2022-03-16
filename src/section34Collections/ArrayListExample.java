package section34Collections;

import java.util.ArrayList;

public class ArrayListExample {

	//ArrayList can contains duplicates
	//ArrayList,LinkedList,Vector --> implementing List interface
	//Array have fixed size where as arraylist can grow dynamically
	//In ArrayList we can access and insert any values at any index
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a = new ArrayList<String>();   //having dynamic size
		a.add("Rohit");     // To add in arraylist use add(data)
		a.add("Java");
		a.add("Java");
		System.out.println(a);
		
		a.add(0, "student");      //To add at particular index   add(index, data)
		System.out.println(a);
		/*
		a.remove(1);             //To remove use remove(index)
		a.remove("Java");         //To remove with value/data   use remove(data)  [case sensitive]
		System.out.println(a);
		*/
		
		System.out.println(a.get(0));   // To get particular data with index
		
		//to check specific data/value is present in ArrayList use contains() mehtod return boolean
		System.out.println(a.contains("testing"));
		
		
		//to check data/value present at what index.. use indexOf(data/Value)
		System.out.println(a.indexOf("Rohit"));
		
		
		//To get size of arraylist
		System.out.println(a.size());
		
		//To check arraylist is empty or not  boolean
		System.out.println(a.isEmpty());
		
	}

}
