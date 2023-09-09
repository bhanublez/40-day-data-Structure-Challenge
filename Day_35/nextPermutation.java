public class nextPermutation {
    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public void nextPermutation(int[] nums) {
        int i, breakPoint = 0, pos = 0, min = Integer.MAX_VALUE;
        for (i = nums.length - 1; i >= 1; i--) {
            if (nums[i] > nums[i - 1]) {
                breakPoint = i;
                break;
            }
        }
        if (breakPoint > 0) {
            for (i = breakPoint; i < nums.length; i++) {
                if (nums[i] > nums[breakPoint - 1]) {
                    min = Math.min(min, nums[i]);
                }
                if (min == nums[i]) {
                    pos = i;// Marks the minimum postion
                }
            }
            swap(nums, pos, breakPoint - 1);
        }
        int n = nums.length - 1;
        while (breakPoint <= n) {
            swap(nums, breakPoint, n);
            n--;
            breakPoint++;
        }

    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        nextPermutation obj=new nextPermutation();
        obj.nextPermutation(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
