package recusion;

import q3.recusion;

public class equalityOfArrays {

	public static void main(String[] args) 
	{
		 int a[]= {1,2,3,4,5,6,7};
		 int b[]= {1,2,3,45,5,6,7};
		 if(a.length==b.length)
		 {
			int count1= EqualityOFArrays(a,b,0,0);
		
			 if(count1==0)
				 System.out.println("Same");
			 else
				 System.out.println("Not same");
		 }
		 else
		 {
			 System.out.println("Not Same");
		 }
	}

	private static int  EqualityOFArrays(int[] a,  int[] b, int i, int count) 
	{
		if(a[i]!=b[i])
			{
				count++;
			}
		i++;
		if(i<a.length)
		return	EqualityOFArrays(a, b, i, count);
		return count;
		
	}

}
