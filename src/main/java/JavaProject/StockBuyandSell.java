package JavaProject;

public class StockBuyandSell {
	
	public static int maximumProfit(int arr[]) {
		int minProfit=Integer.MAX_VALUE;
		int maxProfit=0;
		if(arr==null||arr.length==0)
			return 0;
		for(int i=0;i<arr.length;i++) {
			minProfit=Math.min(minProfit, arr[i]);
			int buy=arr[i]-minProfit;
			maxProfit=Math.max(maxProfit, buy);
		}
		return maxProfit;
	}

	public static void main(String[] args) {
		int arr[]= {3,5,1,7,4,9,3};
		System.out.print(maximumProfit(arr));

	}

}
