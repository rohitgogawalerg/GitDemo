package section33;

public class ConstructorDemo {
	
	//Constructor will not return values
	//Constructor name same as class name
	//Constructor will be called when class object is created
	
	public ConstructorDemo()   //Default constructor
	{
		System.out.println("I am in the default Constructor");
	}
	
	
	//Parameterized Constructor
	public ConstructorDemo(int a, int b)
	{
		System.out.println("I am in the parameterized Constructor");
		int c=a+b;
		System.out.println(c);
	}
	
	public ConstructorDemo(String str)
	{
		System.out.println(str);
	}
	
	//Normal Method
	public void getData()
	{
		System.out.println("I am method");
	}
	
	public static void main(String[] args)
	{
		ConstructorDemo cd = new ConstructorDemo();
		ConstructorDemo c = new ConstructorDemo(4,5);
		ConstructorDemo cs = new ConstructorDemo("Hello");
		
		
		//compiler will call implicit constructor when there is no constructor explicitly defined
	}

}
