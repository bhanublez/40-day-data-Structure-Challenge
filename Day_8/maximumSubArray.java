//https://leetcode.com/problems/maximum-subarray/description/
public class maximumSubArray {

    //My Brute force approach
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        //Brute force (time limit exceeded on 205/210 testcase)
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
               max= Math.max(max,sum);
            }
        }
        return max;
    }

    //Optimized approach
    public int maxSubArray2(int[] nums) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            max=Math.max(max,sum);
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        maximumSubArray ms=new maximumSubArray();
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(ms.maxSubArray(nums));
        System.out.println(ms.maxSubArray2(nums));
    }
}
