package recusion;

import java.util.Arrays;

public class SortingArrays {

	public static void main(String[] args) {
	 int a[]= {45,14,23,56,96,36,78,96};
	 
	 PrintMYArrays(a,0,0);
	 System.out.println(Arrays.toString(a));
	}

	private static void PrintMYArrays(int[] a, int i, int j) 
	{
		 SortArrays(a,i,0);
		 i++;
		 if(i<a.length)
			 PrintMYArrays(a, i, j);
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
