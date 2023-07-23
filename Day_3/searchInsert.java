//https://leetcode.com/problems/search-insert-position/
public class searchInsert {
    public static void main(String[] args) {
        int arr[]={1,3,5,6};
        int target=5;
        System.out.println(searchInsert(arr,target));
        System.out.println(searchInsert2(arr,target));
    }

    //Iterative approach
    //Time complexity: O(log n)
    public static int searchInsert(int[] nums, int target) {
        int low=0;
        int high=nums.length - 1;
        while(low <= high)
        {
            int mid= low + ( high - low) / 2;
            if(nums[mid] == target) return mid;
            if( nums[mid] > target) high=mid - 1;
            if(nums[mid] < target) low=mid + 1;
        }
       return low;
    }

    //Recursive approach
    //Time complexity: O(log n)
    public static int searchInsert2(int[] nums, int target) {
        return binarySearch(nums,0,nums.length - 1,target);
    }
    public static int binarySearch(int []arr,int low,int high,int target){
        if(low > high) return low;
        int mid=low + (high - low) / 2;
        if(arr[mid] == target) return mid;
        if(arr[mid] > target) return binarySearch(arr,low,mid - 1,target);
        return binarySearch(arr,mid + 1,high,target);
    }
    
}
