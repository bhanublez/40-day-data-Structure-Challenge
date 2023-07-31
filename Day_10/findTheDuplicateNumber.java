//https://leetcode.com/problems/find-the-duplicate-number/
public class findTheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        return find(nums,0);
    }
    int find(int[] nums,int check){
        if(check==nums[check]){
            return check;
        }
        int store=nums[check];
        nums[check]=check;
        return find(nums,store);
    }
    public static void main(String[] args) {
        findTheDuplicateNumber fdn = new findTheDuplicateNumber();
        int[] nums = {1,3,4,2,2};
        System.out.println(fdn.findDuplicate(nums));
    }
}
