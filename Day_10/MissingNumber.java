//https://leetcode.com/problems/missing-number/description/
public class MissingNumber {
    public int missingNumber(int[] nums) {
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        int esum=0;
        int n=nums.length;
        esum=(n*(n+1))/2;
               return esum-sum;
     }
    public static void main(String[] args) {
        MissingNumber mn = new MissingNumber();
        int[] nums = {3,0,1};
        System.out.println(mn.missingNumber(nums));
    }
}
