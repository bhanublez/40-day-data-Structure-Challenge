/*3 We define a harmonious array as an array where the difference between its maximum 
value and its minimum value is exactly 1. */
//https://leetcode.com/problems/longest-harmonious-subsequence/

import java.util.HashMap;
import java.util.Map;

public class longestHarmonicSubSequence {

    //Brute force approach
    //Time complexity O(n^2)
    public static int findLHS(int[] nums) {
        int n=nums.length;
        int max=0;
        for(int i=0;i<n;i++){
            int count=0;
            boolean flag=false;
            for(int j=0;j<n;j++){
                if(nums[j]==nums[i]) count++;
                else if(nums[j]==nums[i]+1){
                    count++;
                    flag=true;
                }
            }
            if(flag) max=Math.max(max,count);
        }
        return max;
    }

    //Optimal approach
    //Time complexity O(n)
    public static int findLHSOptimal(int[] nums) {
        int n=nums.length;
        int max=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int key:map.keySet()){
            if(map.containsKey(key+1)){
                max=Math.max(max,map.get(key)+map.get(key+1));
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={1,3,2,2,5,2,3,7};
        System.out.println(findLHS(arr));
    }
}
