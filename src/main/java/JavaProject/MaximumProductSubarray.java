package JavaProject;

public class MaximumProductSubarray {
	
	public static int maxProduct(int arr[]) {
		int result=arr[0];
		int s = 1;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				s=s*arr[j];
				result=Math.max(result, s);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {6,-3,-10,0,2};
		System.out.print(maxProduct(arr));

	}

}
