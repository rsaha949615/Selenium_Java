package JavaProject;

public class LongestSum {
	
	public static int LongestSum(int arr[],int n) {
		int max=arr[0];
		for(int i=0;i<n;i++) {
			int curSum=0;
			for(int j=i;j<n;j++) {
				curSum=curSum+arr[j];
			}
			max=Math.max(max, curSum);
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {-5,4,6,-3,4,-1};
		int n=arr.length;
		System.out.print(LongestSum(arr, n));
	}

}
