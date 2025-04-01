package JavaProject;

public class SmallestSubartaysumGreaterthanx {

    public static int smallestSubarray(int[] arr,int x,int n){
        int min=n+1;
        for(int i=0;i<n;i++){
            int s=0;
            for(int j=i;j<n;j++){
                s+=arr[j];
                if(s>x){
                    min=Math.min(min,j-i+1);
                    break;
                }
            }
        }
        if(min==n+1){
            return -1;
        }else{
            return min;
        }
    }
    public static void main(String[] args) {
        int[] arr={1,4,45,6,0,19};
        int n=arr.length;
        int x=200;
        int result=smallestSubarray(arr,x,n);
        
        if(result!=-1)
        System.out.print(result);
        else
        System.out.print("No subarray");
    }

}
