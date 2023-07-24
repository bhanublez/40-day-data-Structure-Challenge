//https://leetcode.com/problems/smallest-range-i/
public class smallestRange {
    public static int smallestRangeI(int[] nums, int k) {
        int max=nums[0];
        int min=nums[0];
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }
            if(min>nums[i]){
                min=nums[i];
            }
        }
        if(max-k<=min+k){
            return 0;
        }else{
            return max-k-min-k;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,9,10};
        System.out.println(smallestRangeI(arr, 2));
    }
}
