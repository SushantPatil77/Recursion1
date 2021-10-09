package recusion;

import java.util.Arrays;

public class DuplicateRemove {
	
	
	 public static void main(String[] args)
	{
		int[]a= {1,2,3,4,5,6,7,1,2,3,4,5,6,7};
		int count=findDupCount(a,0,1,0);
		int[]b=new int[a.length-count];
		addB(a,b,0,0,1,0);
		System.out.println(Arrays.toString(b));
	}

	private static void addB(int[] a, int[] b, int i, int j, int rank, int index)
	{
		if(j<i)
		{
		if(a[i]==a[j])
			rank++;
		}
		if(j<i)
			j++;
		else 
		{
			if(rank==1)
			{
				b[index++]=a[i];
			}
			i++;
			j=0;
			rank=1;
		}
		if(i<a.length)
			addB(a, b, i, j, rank, index);
			
	}

	private static int findDupCount(int[] a, int i, int j, int count) 
	{
		if(a[i]==a[j])
		{
			count++;
			j=a.length;
		}
		if(j<a.length-1)
			j++;
		else
		{
			i++;
			j=i+1;
		}
		if(i<a.length-1)
			
			count=findDupCount(a, i, j, count);
		return count;
	}
}


