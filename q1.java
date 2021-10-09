package recusion3;

public class q1 {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,10,11,12};
		  int num=78;
		    int min=0;
		    int max=a.length-1;
	   binarySecarch(a,num,min,max);
		
	}

	private static void binarySecarch(int[] a, int num, int min, int max) {
		if(max<min)
    	{
    		System.out.println("Not Found at location");
    		System.exit(0);
    	}
    	int mid=(min+max)/2;
    	
    	if(a[mid]==num)
    	{
    		System.out.println("Found at location= "+mid);
    		 System.exit(0);
    	}
    	
    	else if(num>a[mid])
    		min=mid+1;
    	else
    		max=mid-1;
    	binarySecarch(a, num, min, max);
		
	}
	  

}
