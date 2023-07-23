//https://leetcode.com/problems/set-mismatch/

import java.util.Arrays;

public class setMismatch {

    //My Brute force approach
    public static  int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int sum=n*(n+1)/2;
        int rsum=0;
        int arr[]=new int[2];
        Arrays.sort(nums);
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                arr[0]=nums[i];
                continue;
            }
            rsum+=nums[i];            
        }
        rsum+=nums[n-1];
         arr[1]=sum-rsum;
         return arr;
    }
    //Optimal approach
    public static int[] findErrorNums2(int[] nums) {
        int n=nums.length;
        int arr[]=new int[2];
        for(int i=0;i<n;i++){
            int index=Math.abs(nums[i])-1;
            System.out.println("index "+index);
            if(nums[index]<0) arr[0]=index+1;
            else nums[index]=-nums[index];
        }
        for(int i=0;i<n;i++){
            if(nums[i]>0) arr[1]=i+1;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={1,2,2,4};
        int ans[]=findErrorNums(arr);
        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(findErrorNums2(arr)));
    }
}
