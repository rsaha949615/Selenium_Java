package JavaProject;

import java.util.*;
public class negativeElement {
	
	public static void negativeElement(int arr[],int n) {
		int[] temp=new int[n];
		int j=0;
		for(int i=0;i<n;i++) {
			if(arr[i]<0) {
				temp[j++]=arr[i];
			}
		}
		for(int i=0;i<n;i++) {
			if(arr[i]>=0) {
				temp[j++]=arr[i];
			}
		}
		System.out.print(Arrays.toString(temp));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,-2,3,-4,5,-6,7,-8};
		int n=arr.length;
		negativeElement(arr,n);
	}

}
