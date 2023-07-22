//https://leetcode.com/problems/sort-colors/
public class sortColor {
    //Time complexity : O(n)
    //Space complexity : O(1)
    
    public void sortColors(int[] nums) {
        int p1=0,curr=0,p2=nums.length-1;
        while(curr<=p2){
        if(nums[curr]==0){
            int temp=nums[p1];
            nums[p1]=nums[curr];
            nums[curr]=temp;
            p1++;curr++;
        }else if(nums[curr]==2){
            int temp=nums[curr];
            nums[curr]=nums[p2];
            nums[p2]=temp;
            p2--;
        }else{
            curr++;
        }
        System.out.println(" "+nums[1]);
        }
    }
 public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColor obj = new sortColor();
        obj.sortColors(nums);
        for(int i: nums){
            System.out.print(i + " ");
        }
 }
}
