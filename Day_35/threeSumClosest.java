import java.util.Arrays;

public class threeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length;
        Arrays.sort(nums);
        int close=Integer.MAX_VALUE;
        int result=nums[0]+nums[1]+nums[2];
        for(int i=0;i<n-2;i++){
            int sum=0;
            int left=i+1;
            int right=n-1;
            while(left<right){
                sum=nums[i]+nums[left]+nums[right];
            if(target==sum){
                return target;
            }else if(target>sum){
                left++;
            }else{
                right--;
            }
            int diff=Math.abs(target-sum);
            if(diff<close){
                result=sum;
                close=diff;
            }

            }
        }

        return result;
    }
    public static void main(String[] args) {
        int arr[]={-1,2,1,-4};
        int target=1;
        threeSumClosest obj=new threeSumClosest();
        System.out.println(obj.threeSumClosest(arr,target));
    }
}
