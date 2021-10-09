package recusion;

import java.util.Arrays;

public class q1 {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,10,11,12};
          printMyArrays(a,0,0);
		System.out.println(Arrays.toString(a));
	}

	private static void printMyArrays(int[] a, int i, int j) 
	{
		
		OddEvenArrays(a,i,0);
		i++;
		if(i<a.length)
			printMyArrays(a, i, j);
	}

	private static void OddEvenArrays(int[] a, int i, int j) 
	{
		if(  i<j && a[i]%2!=0 && a[j]%2==0)
			{
			  int temp=a[i];
				   a[i]=a[j];
				   a[j]=temp;
			}
		j++;
		if(j<a.length)
			OddEvenArrays(a, i, j);
		
	}

}
