package section33;

public class ThisKeywordDemo {

	int a=2;   //class level var ie global var.
	
	public void getData()
	{
		int a=3;            //method level var ie local var.
		
		System.out.println(a);
		
		System.out.println(this.a);   // this keyword refers to the current object -> object scope lies in class level
		
		//we can add local and global var  --> interview question
		int b = a + this.a;
		System.out.println("sum of local and global is: "+b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisKeywordDemo td = new ThisKeywordDemo();
		td.getData();

	}

}
