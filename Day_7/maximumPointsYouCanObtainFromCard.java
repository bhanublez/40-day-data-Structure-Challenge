//https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/
public class maximumPointsYouCanObtainFromCard {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,1};
        int k=3;
        System.out.println(maxScore(arr,k));
    }

    //Brute Force Approach
    //Time Complexity: O(n^2)
    //Space Complexity: O(1)
    public static int maxScore(int[] arr, int k) {
        int sum=0;
        int i=0;
        int j=arr.length-1;
        return check(arr,k,i,j,sum);
    }
    public static int check(int arr[],int k,int i,int j,int sum){
        if(k==0){
            return sum;
        }
        int left=check(arr,k-1,i+1,j,sum+arr[i]);
        int right=check(arr,k-1,i,j-1,sum+arr[j]);
        return Math.max(left,right);
    }

    //Optimal Approach
    //Time Complexity: O(n)
    //Space Complexity: O(1)
    public static int maxScore2(int[] arr, int k) {
        int sum=0;
        int i=0;
        int j=arr.length-1;
        for(int l=0;l<k;l++){
            sum+=arr[i++];
        }
        int max=sum;
        for(int l=0;l<k;l++){
            sum-=arr[--i];
            sum+=arr[j--];
            max=Math.max(max,sum);
        }
        return max;
    }
}
