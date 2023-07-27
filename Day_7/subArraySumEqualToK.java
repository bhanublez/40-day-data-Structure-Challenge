//https://leetcode.com/problems/subarray-sum-equals-k/

import java.util.HashMap;

public class subArraySumEqualToK {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,1};
        int k=3;
        System.out.println(subarraySum(arr,k));
    }
    public static int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int count=0;
        int sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
