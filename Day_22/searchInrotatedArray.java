//{ Driver Code Starts
//Initial Template for Java
//https://practice.geeksforgeeks.org/problems/search-in-a-rotated-array4618/1
import java.util.*;
import java.io.*;

public class searchInrotatedArray
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        
        int t = Integer.parseInt(in.readLine().trim());
        while (t-- > 0)
        {
            int n = Integer.parseInt(in.readLine().trim());
            int A[] = new int[n];
            String s[]=in.readLine().trim().split(" ");
            for (int i = 0;i < n;i++)
            {
                A[i] = Integer.parseInt(s[i]);
            }
            int key = Integer.parseInt(in.readLine().trim());
            
            out.println(new Solution().search(A, 0, n - 1, key));
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public static int searchPivot(int arr[],int low,int high){
        if(high<low){
            return -1;
        }
        int mid=(low+high)/2;
        if(arr[mid]>arr[mid+1] && mid<high){
            return mid;
        }
        if(arr[mid]<arr[mid-1] && mid>low){
            return mid-1;
        }
        
        if(arr[low]>=arr[mid]){
            return searchPivot(arr,low,mid-1);
        }else{
            return searchPivot(arr,mid+1,high);
        }
    }
    
    int search(int A[], int l, int h, int key)
    {
        if(l==h){
            return 0;
        }
        int pivot=searchPivot(A,l,h);
        if(pivot==-1){
            return binarySearch(A,l,h,key);
        }
        
        if(A[pivot]==key){
            return pivot;
        }
        
        if(A[l]<=key){
            return binarySearch(A,l,pivot-1,key);
        }else{
            return binarySearch(A,pivot+1,h,key);
        }
        
    }
    public static int binarySearch(int arr[],int low,int high,int key){
        
        if(high<low){
            return -1;
        }
        int mid=(low+high)/2;
        if(arr[mid]==key){
            return mid;
        }else if(arr[mid]<key){
            return binarySearch(arr,mid+1,high,key);
        }else{
            return binarySearch(arr,low,mid-1,key);
        }
    }
}