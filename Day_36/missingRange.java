import java.util.*;

public class missingRange {

    
    static String f(int a, int b) {
        return a == b ? a + "" : a + "->" + b;
    }

    public static List<String> findMissingRange(int arr[], int low, int high) {
        int n = arr.length;
        List<String> ans = new ArrayList<>();
        //Base Case
        if (n == 0) {
            ans.add(f(low, high));
            return ans;
        }
        //Lower Case
        if (arr[0] > low) {
            ans.add(f(low, arr[0] - 1));
        }

        //Middle Case
        for(int i=1;i<n;i++){
            if(arr[i]-arr[i-1]>1){
                ans.add(f(arr[i-1]+1,arr[i]-1));
            }
        }
        //Upper Case
        if(arr[n-1]<high){
            ans.add(f(arr[n-1]+1,high));
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 10, 11, 12, 15, 20 };
        int low = 0, high = 20;
        System.out.println(findMissingRange(arr, low, high));
    }
}