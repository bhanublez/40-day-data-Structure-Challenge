public class searchRange {
    public int[] searchRange(int[] nums, int target) {
        int start = -1, end = -1;
        int low = 0, high = nums.length - 1; 
        int mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (target == nums[mid]) {
                end = mid; 
                high = mid - 1;
            } else if (target < nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        low = 0;
        high = nums.length - 1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (target == nums[mid]) {
                start = mid; 
                low = mid + 1;
            } else if (target < nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
    
        return new int[]{ end,start};
    }
}
