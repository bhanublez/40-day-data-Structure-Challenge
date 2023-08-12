//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Sorting
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];
            
            for(long i = 0; i < n; i++)
             arr[(int)i] = sc.nextLong();
             
            System.out.println(new Solution().inversionCount(arr, n));
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
  // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    static long mergeSortCount(long arr[], int low, int high){
        long count  =0;
        if(high>low){
            int mid = low+(high-low)/2;
            count+=mergeSortCount(arr,low,mid);
            count+=mergeSortCount(arr,mid+1,high);
            count+=mergeCount(arr,low,mid,high);
        }
        return count;
    }
    static long mergeCount(long[] arr, int low, int mid, int high){
        long[] left = Arrays.copyOfRange(arr,low,mid+1);
        long[] right = Arrays.copyOfRange(arr,mid+1,high+1);
        int i=0, j=0, k=low;
        int n1=left.length;
        int n2=right.length;
        long swaps =0;
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                arr[k++]=left[i++];
            }else{
                arr[k++]=right[j++];
                swaps+=(mid+1)-(low+i);
            }
        }
            while(i<left.length){
                arr[k++]=left[i++];
            }
            while(j<right.length){
                arr[k++]= right[j++];
            }
         return swaps;   
        
    }
    static long inversionCount(long arr[], long N)
    {
        // Your Code Here
        int n =arr.length;
        long count = mergeSortCount(arr,0,n-1);
        return count;
    }
}