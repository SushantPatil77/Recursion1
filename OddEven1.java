package recusion;

import java.util.Arrays;

public class OddEven1 {

	public static void main(String[] args) {
	 int a[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
	  int count1=  getcount(a,0,0);
	 int even[]= new int[count1];
	 int odd[]=new int [a.length-count1];
	 printMyArrays(a,even,odd,0,0,0);
	 System.out.println(Arrays.toString(even));
	 System.out.println(Arrays.toString(odd));
	}

	private static void printMyArrays(int[] a, int[] even, int[] odd, int i, int s, int k) 
	{
		if(a[i]%2==0)
		    {
		    	even[k++]=a[i];
		    	
		    }
		    else
		    {
		    	odd[s++]=a[i];
		    }
		i++;
		if(i<a.length)
			printMyArrays(a, even, odd, i, s, k);
		
	}

	private static int getcount(int[] a, int i, int count) 
	{
		 if(a[i]%2==0)
			  {
				  count++;
			  }
		 i++;
		 if(i<a.length)
			 return getcount(a, i, count);
		 return count;
		
	}

}
