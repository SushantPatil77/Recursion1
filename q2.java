package recusion3;

import java.util.Arrays;

public class q2 {

	public static void main(String[] args) {
		int a[]= {11,78,24,56,23,50,82,64};
		 sortMyArrays(a,0,0);
		System.out.println(Arrays.toString(a));
	}
	private static void sortMyArrays(int[] a, int i, int j) 
	{
		int min=i;
		
	int min1=findMin(a,i,min,0);
		
		int temp=a[i];
		a[i]=a[min1];
		a[min1]=temp;
		
		i++;
		if(i<a.length)
			sortMyArrays(a, i, j);
	}

	private static int findMin(int[] a, int i, int min, int j) 
	{
		if(i<j &&a[j]<a[min])
			min=j;
		j++;
		if(j<a.length)
			return findMin(a, i, min, j);
		return min;
		
	}


	}


