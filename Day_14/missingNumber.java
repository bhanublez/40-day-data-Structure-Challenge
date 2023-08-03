//https://leetcode.com/problems/missing-number/
public class missingNumber {
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
              int[] nums = {3,0,1};
              missingNumber test = new missingNumber();
              int result = test.missingNumber(nums);
              System.out.println(result);
     }
}
