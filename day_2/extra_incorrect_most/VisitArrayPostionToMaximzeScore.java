package extra_incorrect_most;
//incorrect Fix letter
public class VisitArrayPostionToMaximzeScore {
    public long maxScore(int[] nums, int x) {
        int n = nums.length;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += nums[i];
        }
        int target = sum - x;
        int curr = 0;
        int max = Integer.MIN_VALUE;
        int i = 0;
        int j = 0;
        while(j < n){
            curr += nums[j];
            while(curr > target){
                curr -= nums[i];
                i++;
            }
            if(curr == target){
                max = Math.max(max, curr);
            }
            j++;
        }
        return max == Integer.MIN_VALUE ? -1 : sum - max;
    }
    public static void main(String[] args) {
        int[] nums = {2,3,6,1,9,2};
        int x = 5;
        VisitArrayPostionToMaximzeScore obj = new VisitArrayPostionToMaximzeScore();
        long res = obj.maxScore(nums, x);
        System.out.println(res);
    }

}

        
