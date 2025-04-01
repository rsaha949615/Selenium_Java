package JavaProject;

import java.util.*;
public class subarraySumZero {
	
	public static boolean SubArrayExists(int arr[],int n) {
		for(int i=0;i<n;i++) {
			int sum=0;
			for(int j=i;j<n;j++) {
				sum=sum+arr[j];
				if(sum==0)
					return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,-1};
		int n=arr.length;
		if(SubArrayExists(arr,n)) {
			System.out.println("Sum Zero");
		}else {
			System.out.println("Sum not zero");
		}
	}

}
