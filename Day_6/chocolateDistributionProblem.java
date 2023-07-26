import java.util.Arrays;

public class chocolateDistributionProblem{
    public static void main(String[] args) {
        int[] arr = {7, 3, 2, 4, 9, 12, 56};
        int child = 3;
        int n = arr.length;
        System.out.println("Minimum difference is " + findMinDiff(arr, n, child));
    }

    static int findMinDiff(int[] arr, int n, int child){
        if(child == 0 || n == 0){
            return 0;//No children or no packets
        }
        Arrays.sort(arr);
        if(n < child){
            return -1; //More children than packets
        }
        int min_diff = Integer.MAX_VALUE;//Initialize min_diff
        for(int i = 0; i < n-child+1; i++){
            int diff = arr[i + child - 1] - arr[i];//Find the difference between the last and first packet
            if(diff < min_diff){
                min_diff = diff;//Update min_diff
            }
        }
        return min_diff;
    }
}