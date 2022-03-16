package section33;

public class ChildDemo extends ParentDemo{

	String name = "QAClickAcademy";
	
	
	public ChildDemo()
	{   
		super();   //super() method is used to call parent class constructor. super() should be the first line of child class constructor.
		System.out.println("I am child class constructor");
	}
	
	public void getStringData()
	{
		System.out.println(name);
		System.out.println(super.name);    //super keyword is used to get parent data in inherited class. Mostly used when there is same variable or method
		
	}
	
	
	public void getData()
	{
		super.getData();                  //super keyword is used to get parent data in inherited class. Mostly used when there is same variable or method
		System.out.println("I am child class");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildDemo cd = new ChildDemo();
		cd.getStringData();
		cd.getData();
	}

}
