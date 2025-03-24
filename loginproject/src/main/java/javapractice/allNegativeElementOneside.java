package javapractice;

import java.util.Arrays;

public class allNegativeElementOneside {
	
	public static void negativeElement(int n, int[] arr) {
		int[] result=new int[arr.length];
		int i=0;
		for(i=0;i<n;i++) {
			if(arr[i]<0) {
				result[i++]=arr[i];
			}
		}
		for(i=0;i<n;i++) {
			if(arr[i]>0) {
				result[i++]=arr[i];
			}
		}
		System.out.print(arr[i]);
		//System.out.print(Arrays.toString(result));
		
	}

	
	public static void main() {
		int arr[]= {1,-2,3,-4,5,-6,7,-8};
		int n=arr.length;
		negativeElement(n,arr);
	}

}
