package recusion2;

public class q3 {
  static int max=Integer.MIN_VALUE; 
	public static void main(String[] args) 
	{
		int a[][]={{1,2,3},
			     {4,5,6},
			     {7,8,9}};
		
		

		PrintMaxNo(a,0,0,max);
		System.out.println(max);
	}

	private static void PrintMaxNo(int[][] a, int i, int j, int max) 
	{
		maxInMaxtrix(a,i,0,max);
		i++;
		if(i<a.length)
		PrintMaxNo(a, i, j, max);
	}

	private static void maxInMaxtrix(int[][] a, int i, int j, int max) 
	{
		if(a[i][j]>max)
		{
			max=a[i][j];
		}
		j++;
		if(j<a[i].length)
			maxInMaxtrix(a, i, j, max);
		
	}

}
