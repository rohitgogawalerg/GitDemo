package section32;

public class AustralianTraffic implements CentralTraffic,ContinentalTraffic{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//we must have to add interface methods in class after implementing 
		//we can define class methods also in class
		//Class can implement multiple interface
		
		CentralTraffic a = new AustralianTraffic();   // we can call methods with interface reference [only methods mentioned in interface]
		a.greenGo();
		a.redStop();
		a.flashingYellow();
		
		AustralianTraffic at = new AustralianTraffic();  //for class method need create class object and as methods are in class we can access with same class object
		at.walkOnSymbol();
		at.greenGo();
		at.redStop();
		at.flashingYellow();
		at.trainSymbol();
		
		ContinentalTraffic ct = new AustralianTraffic();
		ct.trainSymbol();
		
				
				
				
				
	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("green go implementation");
		
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		//code
		System.out.println("redstop implementation");
	}

	@Override
	public void flashingYellow() {
		// TODO Auto-generated method stub
		//code
		System.out.println("flash yellow implementation");
	}

	public void walkOnSymbol()
	{
		System.out.println("Walk on Symbol");
	}

	@Override
	public void trainSymbol() {
		// TODO Auto-generated method stub
		System.out.println("Train Symbol");
		
	}
	
}
