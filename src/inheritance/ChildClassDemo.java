package inheritance;

public class ChildClassDemo extends ParentClassDemo {

	
	public void engine()
	{
		System.out.println("New Engine");
	}
	
	public void color()
	{
		System.out.println(colour);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClassDemo cd = new ChildClassDemo();
		cd.color();
		cd.breaks();
		cd.audioSystem();

	}

}
