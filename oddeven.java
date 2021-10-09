package recusion;

import java.util.Arrays;

public class oddeven {

	public static void main(String[] args) {
		 int a[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
			int q=  getcount(a,0,0);
			 int b[]=new int[q];
			 int o[]=new int[a.length-q];
			 printMYArraysOddAndEven(a,b,o,0,0,0);
			 System.out.println(Arrays.toString(b));
			 System.out.println(Arrays.toString(o));
			}
			private static void printMYArraysOddAndEven(int[] a, int[] b, int[] o, int i, int s, int k) 
			{
				if(a[i]%2==0)
					{
						b[k++]=a[i];
					}
					else if(a[i]%2!=0)
					{
						o[s++]=a[i];
					}
				i++;
				if(i<a.length)
					printMYArraysOddAndEven(a, b, o, i, s, k);
			}
			private static int getcount(int[] a, int i, int c) 
			{
				if(a[i]%2==0)
		    	  c++;
				i++;
				if(i<a.length)
					return getcount(a, i, c);
				return c;
				
			}

	}


