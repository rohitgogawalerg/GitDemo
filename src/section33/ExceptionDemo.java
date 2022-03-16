package section33;

public class ExceptionDemo {

	int a=4;
	

	//one try can have multiple catch block
	//catch must be followed by try block 
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int b=7;
		int c=0;
		
	try 
	{
	    int k = b/0;	
	    System.out.println(k);
	    
	    int arr[] = new int[5];
	    System.out.println(arr[6]);
	}
	catch(ArithmeticException et)  //Arithmetic exception
	{
		System.out.println("I catched Arthmetic Exception");
	}
	catch(IndexOutOfBoundsException ets)    //array exception
	{
		System.out.println("I catched Index out of bound excetion");
	}
	catch(Exception e)  //general exception
	{
		System.out.println("I catched the Exception");
	}
	finally
	{
		System.out.println("delete cookies");
		//This block will execute irrespective error is thrown or not.
		//it should have try block 
	}
		
		
	}

}
