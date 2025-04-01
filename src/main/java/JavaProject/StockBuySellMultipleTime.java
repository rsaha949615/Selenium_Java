package JavaProject;

import java.util.*;
public class StockBuySellMultipleTime {
	
	public static int stockandBuy(int arr[]) {
		int p=0;
		int s=0;
		for(int i=0;i<arr.length-1;i++) {
				if(arr[i+1]>arr[i]) {
					p=arr[i+1]-arr[i];
					s=s+p;
				}
		}
		return s;
	}
	public static void main(String[] args) {
		int arr[]= {100,180,260,310,40,535,695};
		System.out.print(stockandBuy(arr));
	}
}
