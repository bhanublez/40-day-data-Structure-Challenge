public class median2SortedArray {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        if (m > n) {
            return findMedianSortedArrays(nums2, nums1);
        }
        return searchMedian(nums1, nums2, m, n);
    }
    
    public static double searchMedian(int arr1[], int arr2[], int m, int n) {
        int low = 0;
        int high = m;
    
        while (low <= high) {
            int cut1 = (low + high) / 2;
            int cut2 = (m + n + 1) / 2 - cut1;
    
            int l1 = (cut1 == 0) ? Integer.MIN_VALUE : arr1[cut1 - 1];
            int l2 = (cut2 == 0) ? Integer.MIN_VALUE : arr2[cut2 - 1];
            int r1 = (cut1 == m) ? Integer.MAX_VALUE : arr1[cut1];
            int r2 = (cut2 == n) ? Integer.MAX_VALUE : arr2[cut2];
    
            if (l1 <= r2 && l2 <= r1) {
                if ((m + n) % 2 != 0) { // Odd Condition
                    return Math.max(l1, l2);
                } else { // Even Condition
                    return (double) (Math.max(l1, l2) + Math.min(r1, r2)) / 2;
                }
            } else if (l1 > r2) {
                high = cut1 - 1;
            } else {
                low = cut1 + 1;
            }
        }
        throw new IllegalArgumentException("दया कुछ तो गड़बड़ है");
    }
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int arr2[]={2,3,5,78,89};
        System.out.println("Median is "+findMedianSortedArrays(arr1,arr2));
    }
}
