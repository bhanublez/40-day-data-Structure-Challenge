//https://leetcode.com/problems/4sum/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fourSum {
    public static void main(String[] args) {
        int[] arr={1,0,-1,0,-2,2};
        System.out.println(fourSum(arr,0));
    }

    //Brute Force Approach
    //Time Complexity: O(n^4)
    //Space Complexity: O(1)
    public static List<List<Integer>> fourSum(int[] arr, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<arr.length-3;i++){
            for(int j=i+1;j<arr.length-2;j++){
                for(int k=j+1;k<arr.length-1;k++){
                    for(int l=k+1;l<arr.length;l++){
                        if(arr[i]+arr[j]+arr[k]+arr[l]==target){
                            List<Integer> temp=new ArrayList<>();
                            temp.add(arr[i]);
                            temp.add(arr[j]);
                            temp.add(arr[k]);
                            temp.add(arr[l]);
                            if(!ans.contains(temp))
                            ans.add(temp);
                        }
                    }
                }
            }
        }
        return ans;
    }

    //Optimal Approach
    //Time Complexity: O(n^3)
    //Space Complexity: O(1)
    public List<List<Integer>> twoSum(int[] nums,long target, int firstIndex){
        List<List<Integer>> ans= new ArrayList<>();
        int low = firstIndex;
        int high = nums.length-1;
        while(low < high){
            long sum = nums[low]+nums[high];
            if( sum> target) high--;
            else if(sum < target) low++;
            else {
               ans.add(new ArrayList<>( Arrays.asList(nums[low],nums[high])));
               while(low<high && nums[low] == nums[low+1]) low++;
               while(low<high && nums[high] == nums[high-1]) high--;
               low++;
               high--;
            }

        }
        return ans;
   }
}
