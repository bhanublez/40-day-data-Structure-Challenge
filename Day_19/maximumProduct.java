import java.util.Arrays;
//https://leetcode.com/problems/maximum-product-of-three-numbers/description/
public class maximumProduct {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int result=Integer.MIN_VALUE;
        result = Math.max(nums[0]*nums[1]*nums[n-1], nums[n-1]*nums[n-2]*nums[n-3]);
        return result;
    }
    public static void main(String[] args) {
        maximumProduct obj = new maximumProduct();
        int[] nums = {1,2,3,4};
        System.out.println(obj.maximumProduct(nums));
    }
}
