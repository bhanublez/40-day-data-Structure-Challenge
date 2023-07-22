package day_1;

public class palindromicArrayConversion {
    public static int findOps(int arr[],int n){
        int ans=0;
        for(int i=0,j=n-1;i<=j;){
            if(arr[i]==arr[j]){
                i++;
                j--;
            }else if(arr[i]>arr[j]){
                j--;
                arr[j]=arr[j+1];
                ans++;
            }else{
                i++;
                arr[i]+=arr[i-1];
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={19,4,5,1};
        System.out.println("Total number of operations is: "+ findOps(arr,arr.length));
    }
    
}
