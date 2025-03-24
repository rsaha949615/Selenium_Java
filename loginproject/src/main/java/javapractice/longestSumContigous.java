package javapractice;

public class longestSumContigous {

	public static int ContigouesSubArray(int n,int arr[]) {
		int max=arr[0];
		for(int i=0;i<n;i++) {
			int cursum=0;
			for(int j=i;j<n;j++) {
				cursum=cursum+arr[j];
			}
			max=Math.max(max, cursum);
		}
		return max;
		
			
	}
	public static void main(String[] args) {
		int[] arr= {2,1};
		int n=arr.length;
		System.out.print(ContigouesSubArray(n, arr));
	}
}
