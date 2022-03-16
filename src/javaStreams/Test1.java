package javaStreams;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}
	
	
	//@Test
	public void regular()
	{
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		
		int count = 0;
		for(int i =0 ; i<names.size();i++)
		{
			String actual = names.get(i);
			if(actual.startsWith("A"))			
				count++;
		}
		System.out.println(count);
	}
	
	
	//@Test
	public void streamFilter()	
	{
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		
		//There is no life for intermediate operation if there is no terminal operation
		//Terminal operation will execute only if intermediate operation(filter) return true
		//We can create stream
		//how to use filter in stream API
		
		
		long c = names.stream().filter(s->s.startsWith("A")).count();   // filter --> intermediate op   count--> terminal op
		System.out.println(c);
		
		Long d = Stream.of("Abhijeet","Don","Alekhya","Adam","Ram").filter(s->
		{
			s.startsWith("A");
			//return false;    //value will be 0 in output as filter return false
			return true;
		}).count();
		System.out.println(d);
		
		//print names in arraylist
		//names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));  //print only 1st element having length >4
			
	}
	
	//@Test
	public void streamMap()
	{
		ArrayList<String> names = new ArrayList<String>();
		names.add("Men");
		names.add("Don");
		names.add("women");
		
		
		
		//print names which have last letter as "a" with uppercase
		Stream.of("Abhijeet","Don","Alekhya","Adam","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase())    //map to manipulate strings like uppercase or lowercase
		.forEach(s->System.out.println(s));
		
		//print names which have firsr letter as "A" with uppercase and sorted
		List<String> names1 = Arrays.asList("Abhijeet","Don","Alekhya","Adam","Rama");  //convert array into arraylist
		names1	.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase())   //sorted() to sort array
		.forEach(s->System.out.println(s));
		
		Stream<String> newStream = Stream.concat(names.stream() , names1.stream());   //to merge use concat
		//newStream.sorted().forEach(s->System.out.println(s));                         // sort and print
		
		boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("adam"));  //anymatch for finding match
		System.out.println(flag);
		Assert.assertTrue(flag);
		
	}
	
	@Test
	public void streamCollect()
	{
		List<String> ls = Stream.of("Abhijeet","Don","Alekhya","Adam","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		.collect(Collectors.toList());                            //collect all and form list
		System.out.println(ls.get(0));        //get --> to get value
		
		
		List<Integer> values = Arrays.asList(3,2,2,7,5,1,9,7);
		//print unique number from an array 
		//sort array and give 3rd index
		values.stream().distinct().forEach(s->System.out.println(s));
		
		List<Integer> li = values.stream().distinct().sorted().collect(Collectors.toList());  //use collect method if want to print spectific number
		System.out.println(li.get(2));   //get 3rd index
		
	}
}
