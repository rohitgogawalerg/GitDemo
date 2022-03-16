package section34Collections;

import java.util.ArrayList;

public class CollectionsExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {4,5,5,5,4,6,6,9,4};
		
		//print unique number from list  --> Amazon interview 
		
		//1.Create an arraylist
		//2.for traversing --> one for loop
		//3.set counter =0;
		//4.check that if arraylist dosent have element of array then add it and incraese counter
		//5.For traversing remianing elements of array--> for loop with j=i+1
		//6.check if a[i]=a[j] increase counter.
		//5.print occurance of elements
		//6.if count = 1 then its unique number
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			
			if(!al.contains(a[i]))
			{
				al.add(a[i]);
				count++;
				
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						count++;
					}
				}
				
				System.out.println(a[i]+" is repeated "+count+" times");
				
				if(count ==1)
				{
					System.out.println(a[i]+" is unique number");
				}
			}
			
		}
		
		
	}

}
