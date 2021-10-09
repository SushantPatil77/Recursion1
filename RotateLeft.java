package recusion;

import java.util.Arrays;

public class RotateLeft {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8};
		int temp=a[0];
		RotateElement(a,temp,0);
         a[a.length-1]=temp;
		System.out.println(Arrays.toString(a));
	}

	private static void RotateElement(int[] a, int temp, int i) {
		a[i]=a[i+1];
		i++;
		if(i<a.length-1)
			RotateElement(a, temp, i);
		
	}

}
