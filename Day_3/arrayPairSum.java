// https://leetcode.com/problems/array-partition/description/

import java.util.Arrays;

public class arrayPairSum {
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length;i=i+2){
            sum+=nums[i];

        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[]={1,4,3,2};
        System.out.println(arrayPairSum(arr));
    }
}
