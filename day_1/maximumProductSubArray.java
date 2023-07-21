package day_1;
/*
Given an integer array nums, find a subarray
that has the largest product, and return the product.
The test cases are generated so that the answer will fit in a 32-bit integer.
 */
public class maximumProductSubArray {
    class Solution {
        public int maxProduct(int[] nums) {
            int max=nums[0];
            int min=max;
            int result=max;
            for(int i=1;i<nums.length;i++){
                int curr=nums[i];
                int temp=Math.max(curr,Math.max(max*curr,min*curr));
                min=Math.min(curr,Math.min(max*curr,min*curr));
                max=temp;
                result=Math.max(result,max);
            }
            return result;
        }
    }
}
