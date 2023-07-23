package Prac;
/*
You are given a 0-indexed array nums consisting of positive integers.

You can do the following operation on the array any number of times:

Choose an integer i such that 0 <= i < nums.length - 1 and nums[i] <= nums[i + 1]. Replace the element nums[i + 1] with nums[i] + nums[i + 1] and delete the element nums[i] from the array.
Return the value of the largest element that you can possibly obtain in the final array.
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class largetElmentByMerging {
    public static long maxArrayValue(int[] nums) {
        int arr[]=merge(nums);      
        return max(arr);
    }
    
    

    private static int[] merge(int[] nums) {
       int[] arr=new int[nums.length];
       int max=(int) max(nums);
       int count=0;
        for(int i=0;i<nums.length-1 && i>=0;i++){
            if(nums[i]<=nums[i+1]){
                nums[i+1]=nums[i]+nums[i+1];
                nums[i]=0;  
                i++;       
                count++;    
            } 
        }
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                arr[j++]=nums[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        return max==(int)max(arr)?arr:merge(Arrays.copyOfRange(arr, 0, nums.length-count));
    }



    private static long max(int[] nums) {
        long max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = { 34,95,50,12,25,100,21,3,25,16,76,73,93,46,18};
        System.out.println(maxArrayValue(nums));
    }

}
