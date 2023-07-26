//https://leetcode.com/problems/find-all-duplicates-in-an-array/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class findAllDuplicateInArray {
    //Brute force approach
    //Map based
    public List<Integer> findDuplicates(int[] nums) {
       int n=nums.length;
       ArrayList<Integer> list=new ArrayList<>();
       Map<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<n;i++){
           if(map.containsKey(nums[i])){
               map.put(nums[i],map.get(nums[i])+1);
           }
           else{
               map.put(nums[i],1);
           }
       }
         for(Map.Entry<Integer,Integer> entry:map.entrySet()){
              if(entry.getValue()>1){
                list.add(entry.getKey());
              }
         }
        return list;        
    }

    //Optimal approach
    //Array based
    public List<Integer> findDuplicates2(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> list=new ArrayList<>();
        int[] arr=new int[n+1];
        for(int i=0;i<n;i++){
            arr[nums[i]]++;
        }
        for(int i=0;i<n+1;i++){
            if(arr[i]>1){
                list.add(i);
            }
        }
        return list;
    }

    
    public static void main(String[] args) {
        int[] nums={4,3,2,7,8,2,3,1};
        findAllDuplicateInArray obj=new findAllDuplicateInArray();
        System.out.println(obj.findDuplicates(nums));

    }
}
