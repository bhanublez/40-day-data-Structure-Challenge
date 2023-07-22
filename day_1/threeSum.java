package day_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class threeSum {
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
           Set<List<Integer>> result=new HashSet<>();
           Set<Integer> duplicate=new HashSet<>();
           Map<Integer,Integer> map=new HashMap<>();
           for(int i=0;i<nums.length;i++){
               if(duplicate.add(nums[i]));
               {
                   for(int j=i+1;j<nums.length;j++){
                   int target = -nums[i] - nums[j];
              if (map.containsKey(target) && map.get(target) == i) {
                List<Integer> temp = Arrays.asList(nums[i], nums[j], target);
                Collections.sort(temp);
                result.add(temp);
              }
              map.put(nums[j], i);
            }
          }
        }
        return new ArrayList<>(result);
      }
    }
    public static void main(String[] args) {
        int arr[]={-1,0,1,2,-1,-4};
        System.out.println("Triplets are: "+ threeSum(arr));
    }
     
}
