package JavaProject;


import java.util.*;
import java.util.Arrays;

public class clicallyrorate {
	
	public static void ClicallyRorate(int arr[],int n,int k) {
		int temp[]=new int[n];
		int j=0;
		for(int i=k+1;i<n;i++) {
			temp[j++]=arr[i];
		}
		for(int i=0;i<=k;i++) {
			temp[j++]=arr[i];
		}
		System.out.print(Arrays.toString(temp));
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7};
		int n=arr.length;
		int k=3;
		ClicallyRorate(arr,n,k);
	}

}
