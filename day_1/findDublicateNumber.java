package day_1;
/*Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and uses only constant extra space. */
public class findDublicateNumber {
    class Solution {
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
    }
    public static void main(String[] args) {
        int arr[]={1,3,4,2,2};
        System.out.println("Dublicate number is: "+ findDuplicate(arr));
    }
}
