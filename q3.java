package recusion3;

import java.util.Arrays;

public class q3 {

	public static void main(String[] args) {
		 int[]a= {11,78,9,6,86,3,2,1};
	    printMyArrays(a,1);
	      System.out.println(Arrays.toString(a));
	}

	private static void printMyArrays(int[] a, int i)
	{
		 int temp=a[i];
	     int start1=ForJLoop(a,i,temp,0,i-1);
	    forkLoop(a,i,temp,start1,i-1);
        a[start1]=temp;
        i++;
        if(i<a.length)
        	printMyArrays(a, i);
		
	}

	private static void forkLoop(int[] a, int i, int temp, int start1, int k) 
	{
		a[k+1]=a[k];
		k--;
		if(k>=start1)
			forkLoop(a, i, temp, start1, k);
		
	}

	private static int ForJLoop(int[] a, int i, int temp, int start, int j) {
		if(a[j]<temp)
			 {
				 start=j+1;
				 return start;
			 }
		j--;
		if(j>=0)
			return ForJLoop(a, i, temp, start, j);
		  return 0;
		
	}

	

}
