//Find Kth smallest elment in given array

import java.util.Arrays;

public class KSmallestElementInArray {
    public static void main(String ar[]){
        int[] arr = {7,10,4,3,20,15};
        int k = 3;
        int res = kthSmallest(arr, k);
        System.out.println(res);
        int res1 = kthSmallestOptimal(arr, k);
        System.out.println(res1);
    }

    //Brute force approach
    public static int kthSmallest(int[] arr, int k){
        int n = arr.length;
        Arrays.sort(arr);
        return arr[k-1];
    }

    //Other approach
    //Time complexity: O(n)
    //Space complexity: O(1)
    public static int kthSmallestOptimal(int[] arr, int k){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while(low <= high){
            int p = partition(arr, low, high);
            if(p == k-1){
                return arr[p];
            }
            else if(p > k-1){
                high = p-1;
            }
            else{
                low = p+1;
            }
        }
        return -1;
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low-1;
        for(int j = low; j < high; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp1 = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp1;
        return i+1;
    }
    
}
