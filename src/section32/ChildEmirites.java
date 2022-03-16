package section32;

public class ChildEmirites extends ParentAirCraft{

	//with extends keyword we can extend class[ie abstract class]
	//abstract class cannot be instantiated.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildEmirites cm = new ChildEmirites();
		cm.engine();
		cm.safeyGuidelines();
		cm.bodyColor();

	}

	@Override
	public void bodyColor() {
		// TODO Auto-generated method stub
		System.out.println("Red color on the body");
	}

}
