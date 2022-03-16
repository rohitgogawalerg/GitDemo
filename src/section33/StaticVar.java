package section33;

public class StaticVar {

	String name;    //instance variable
	String address;
	static String city;  //static keyword is used for memory optimization ie in this case we know city will be common for both members
	static int i;	//Class Variable -> static var are class vars
	
	static {                //static block to define static values
		city ="Banglore";
		i=0;
	}
	
	public StaticVar(String name, String address)
	{
		this.name = name;
		this.address = address;
		i++;
		System.out.println(i);
		
	}
	
	public void getAddress()
	{
		System.out.println(address+" "+city);
	}
	
	
	public static void getCity()   //in static methods we can access only static variables.
	{
		System.out.println(city);
	}
 	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticVar s = new StaticVar("Bob","Marthalli");
		StaticVar s1 = new StaticVar("Ram","JayaNagar");
		s.getAddress();
		s1.getAddress();

		//calling of static methods and variables
		StaticVar.i =4;    //ie. ClassName.VariableName
		System.out.println(StaticVar.i);
		StaticVar.getCity();  // ie. ClassName.MethodName
	}

}
