public class reversePair {
    public int reversePairs(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        return mergeSort(nums, 0, nums.length-1);
    }
    private int mergeSort(int[] nums, int i, int j) {
        if (i >= j) {
            return 0;
        }
        int mid = i + (j-i)/2;
        int count = mergeSort(nums, i, mid) + mergeSort(nums, mid+1, j);
        int[] temp = new int[j-i+1];
        int left = i, right = mid+1, index = 0;
        while (left <= mid && right <= j) {
            if (nums[left] <= nums[right]) {
                temp[index++] = nums[left++];
            } else {
                count += mid-left+1;
                temp[index++] = nums[right++];
            }
        }
        while (left <= mid) {
            temp[index++] = nums[left++];
        }
        while (right <= j) {
            temp[index++] = nums[right++];
        }
        for (int k = 0; k < temp.length; k++) {
            nums[i+k] = temp[k];
        }
        return count;
    }
    public static void main(String[] args) {
        reversePair rp = new reversePair();
        int[] nums = {1,3,2,3,1};
        System.out.println(rp.reversePairs(nums));
    }
}