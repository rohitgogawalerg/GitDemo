package section32;

public class ArrayInterview {

	/*Print minimum number from 3*3 matrix
	   2 4 5
	   3 4 7
	   1 2 9
	*/
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int abc[][] = {{2,4,5},{3,0,7},{1,2,9}};
		int min=abc[0][0];
		int max=abc[0][0];
		
		
		//Find minimum
		for(int i = 0; i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(abc[i][j]<min)
				{
					min =abc[i][j];
				}
			}
		}
		System.out.println("Minimum number of 3*3 Array: "+min);
		
		
		
		//Find Maximum
		for(int i = 0; i<3;i++)
			{
			    for(int j=0;j<3;j++)
					{
						if(abc[i][j]>max)
						{
							max =abc[i][j];
						}
					 }
			 }
		System.out.println("Maximum number of 3*3 Array: "+max);
		
		
		/*
		1]Find minimum number 
		2]Identify col position of minimum number
		2]Find the maximum number in identified column.     -- refer section 32 lecture 274
		*/
		int mincol=0;
		//1st step: finding minimum number
		for(int i = 0; i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(abc[i][j]<min)
				{
					min =abc[i][j];
					mincol = j;                //2nd step: getting col of minimum number
				}
			}
		}
		
		int k=0;
		int max1 = abc[0][mincol];
		while(k<3)
		{
			if(abc[k][mincol]>max1)
			{
				max1 = abc[k][mincol];
			}
			k++;
		}
		System.out.println("Maximum of column[of minimum number]: "+max1);
		
		
		
		
		
	}

}
