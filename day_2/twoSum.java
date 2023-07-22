// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.
// Example: Input: nums = [2,7,11,15], target = 9 Output0 [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1]

import java.util.HashMap;
import java.util.Map;

public class twoSum {
    public int[] twoSum(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("["+i+","+j+"]");
                    return new int[] {i,j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    //Optimized solution
    //Time complexity : O(n)
    //Space complexity : O(n)
    public int[] twoSumOptimized(int arr[],int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int complement = target-arr[i];
            if(map.containsKey(complement)){
                System.out.println("["+map.get(complement)+","+i+"]");
                return new int[] {map.get(complement),i};
            }
            map.put(arr[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target=9;
        twoSum obj = new twoSum();
        obj.twoSum(nums,target);
    }
}
