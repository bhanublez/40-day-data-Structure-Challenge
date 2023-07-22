package extra_incorrect_most;

public class checkIfArrayIsGood {
    public static boolean isGood(int[] nums){
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            max = Math.max(max, nums[i]);
            if(max == i+1){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1, 3, 2};
        boolean res = isGood(nums);
        System.out.println(res);
    }
}
