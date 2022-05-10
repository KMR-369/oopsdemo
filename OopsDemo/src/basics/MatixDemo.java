package basics;

//Program to demonstrate 2-Dimensional Arrays

public class MatixDemo {

	public static void main(String[] args) {
		
		//declare 2d arrays/matrices
		int a[][] = {{22,23,21},
				     {32,43,12},
				     {12,23,24}};
		
		int b[][] = {{20,32,12},
			     	 {23,34,121},
			     	 {18,53,42}}; //matrix with 3 rows and 3 columns
		
		int c[][] = new int[3][3];
		//addition of two matrices
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				c[i][j] = a[i][j] + b[i][j]; //add 2 matrices
				
				System.out.print(c[i][j]+ " "); //print matrix after addition
			}
			System.out.println();
		}

	}

}
