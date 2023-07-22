package day_1;

public class findingMiddleterm {
    public static int findMiddle(int arr[],int n){
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        int leftSum=0;
        for(int i=0;i<n;i++){
            if(leftSum==sum-arr[i]){
                return i;
            }
            leftSum+=arr[i];
            sum-=arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,5};
        System.out.println("Middle term is: "+ findMiddle(arr,arr.length));
    }
}
