package section32;

public class Pb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("1st Pattern");
		/* 1 2 3 4 
		   5 6 7 
 		   8 9 
           10
       */    
		int k=1;
		for(int i=0;i<4;i++)    //outer loop
		{
			//System.out.println("Outer loop started");
			for(int j=1;j<=4-i;j++)   //inner loop
			{
				System.out.print(k);
				System.out.print("\t");
				k++;
				
			}
			
			System.out.println();
			//System.out.println("Outer loop finished");
		}

		System.out.println();
		
		
		System.out.println("2nd Pattern");
		/*
		 10
		  9 8 
		  7 6 5 
		  4 3 2 1
		 */
		int l=10;
		for(int i=0;i<4;i++)    //outer loop
		{
			//System.out.println("Outer loop started");
			for(int j=0;j<1+i;j++)   //inner loop
			{
				System.out.print(l);
				System.out.print("\t");
				l--;
				
			}
			
			System.out.println();
			//System.out.println("Outer loop finished");
		}
		
		
		System.out.println("3rd Pattern");
		/*
		 1
		 2 3
		 4 5 6
		 7 8 9 10 
		  */
		int m=1;
		for(int i=0;i<4;i++)
		{
			for (int j=0;j<1+i;j++)
				{
					System.out.print(m);
					System.out.print("\t");
					m++;
				}
			System.out.println();
		}
		
		
		System.out.println("4th Pattern");
		/*
		 * 1
		 * 1 2
		 * 1 2 3
		 * 1 2 3 4
		 */
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
				System.out.print("\t");
			}
			System.out.println();
		}
		
		
		
		System.out.println("5th Pattern");
		/*
		 * 3
		 * 6 9
		 * 12 15 18
		 */
		int p=3;
		for(int i=1;i<4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(p);
				System.out.print("\t");
				p=p+3;
			}
			System.out.println();
		}

	}

}

