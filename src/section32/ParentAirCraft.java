package section32;

public abstract class ParentAirCraft {
	
	//private AccessModifer cannot be used for abstract methods ie public and protected can be used.
	
	public void engine()
	{
		System.out.println("Follow Engine Guidelines");
	}

	public void safeyGuidelines()
	{
		System.out.println("Safty Guidelines");
	}
	
	public abstract void bodyColor();
}
