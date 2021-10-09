package recusion;

public class LeaderElement {

	public static void main(String[] args)
	{
		int a[]= {1,6,7,10,15,15,11,6,3,9};
		printMyArrays(a,0,0);

	}

	private static void printMyArrays(int[] a, int i, int j) 
	{
		int s= learderelement(a,i,0,0);
		if(s==0)
		System.out.println(a[i]);
		i++;
		if(i<a.length)
			printMyArrays(a, i, j);
	}

	private static int learderelement(int[] a, int i, int j, int count) 
	{
		if( i<j && a[j]>=a[i])
			count++;
		j++;
		if(j<a.length)
			return learderelement(a, i, j, count);
		return count;
	}

}
