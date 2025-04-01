package JavaProject;

import java.util.*;
public class countfrequency {

	public static void CountFrequency(int arr[],int n) {
		HashMap<Integer,Integer> m=new HashMap<>();
		for(int i=0;i<n;i++) {
			if(m.containsKey(arr[i])) {
				m.put(arr[i], m.get(arr[i])+1);
			}else {
				m.put(arr[i], 1);
			}
		}
		for(Map.Entry<Integer,Integer> e:m.entrySet()) {
			System.out.println(e.getValue()+"="+e.getKey());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,20,10,5,10};
		int n=arr.length;
		CountFrequency(arr,n);
	}

}
