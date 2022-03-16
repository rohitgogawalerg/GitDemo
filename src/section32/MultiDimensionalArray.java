package section32;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][] = new int[2][3];
		a[0][0] = 2;
		a[0][1] = 4;
		a[0][2] = 6;
		a[1][0] = 8;
		a[1][1] = 1;
		a[1][2] = 5;
		System.out.println(a[1][0]);
			
		int b[][] = {{2,4,6},{8,1,5},{5,2,1}};   //complete row in first box, complete row in second box like wise
		System.out.println(b[2][1]);
		
		//Print all elements of array
		System.out.println("Print all elements of 2D array");
		for(int i=0;i<2;i++)    //for row
		{
			for(int j=0;j<3;j++)   //for cloumn
			{
				System.out.println(a[i][j]);
			}
		}

	}

}
