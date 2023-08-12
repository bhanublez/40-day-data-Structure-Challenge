//https://leetcode.com/problems/kth-largest-element-in-an-array/
public class KthLargestElement {
    public int findKthLargest(int[] nums, int k) {
        return selectionProcedure(nums,0,nums.length-1,k);
    }
    private int selectionProcedure(int[] nums, int i, int j, int k) {
        int pivot=nums[j];
        int left=i;
        for(int right=i;right<j;right++){
            if(nums[right]<=pivot){
                swap(nums,left,right);
                left++;
            }
        }
        swap(nums,left,j);
        int count=j-left+1;
        if(count==k){
            return nums[left];
        }
        if(count>k){
            return selectionProcedure(nums,left+1,j,k);
        }
        return selectionProcedure(nums,i,left-1,k-count);
    }
    private void swap(int[] nums, int left, int right) {
        int temp=nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
    }
    public static void main(String[] args) {
        KthLargestElement kthLargestElement=new KthLargestElement();
        int[] nums={3,2,1,5,6,4};
        System.out.println(kthLargestElement.findKthLargest(nums,2));
    }
}
