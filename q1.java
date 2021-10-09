package recusion2;

public class q1 {

	public static void main(String[] args) {
		int a[][]=  {{1,2,3},
				     {4,5,6},
				     {7,8,9}};
		printMyArrays(a,0,0);
	}

	private static void printMyArrays(int[][] a, int i, int j) 
	{
		 OuterElement(a,i,0);
		 System.out.println();
		 i++;
		 if(i<a.length)
			 printMyArrays(a, i, j);
		
	}

	private static void OuterElement(int[][] a, int i, int j) 
	{
		if(i==0 ||j==a.length-1||i==a.length-1|| j==0)
			 System.out.print(a[i][j]+" ");
		 else
			 System.out.print("  ");
		j++;
		if(j<a[i].length)
			OuterElement(a, i, j);
		
	}

}
