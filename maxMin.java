package recusion;

import java.util.Arrays;

public class maxMin {

	public static void main(String[] args) {
		int a[]= {1,4,9,6,3,10,12,7,89,32};

		PrintMyArrays(a,0,0);
		System.out.println("Min= "+a[0]);
		System.out.println("Max= "+a[a.length-1]);
		System.out.println("Diff= "+(a[a.length-1]-a[0]));
	}

	private static void PrintMyArrays(int[] a, int i, int j)
	{

	      SortArrays(a,i,0);
	      i++;
	      if(i<a.length)
	    	  PrintMyArrays(a, i, j);
		
	}

	private static void SortArrays(int[] a, int i, int j)
	{
		if(i<j && a[i]>a[j])
			{
				int temp=a[i];
				     a[i]=a[j];
				     a[j]=temp;
			}
		j++;
		if(j<a.length)
			SortArrays(a, i, j);
	}

}
