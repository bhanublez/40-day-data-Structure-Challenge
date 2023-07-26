//https://leetcode.com/problems/remove-duplicates-from-sorted-array/submissions/
public class removeDuplicateFromSortedArray {
 public static int removeDuplicateFromSortedArray(int arr[]){
        int res=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[res-1]){
                arr[res]=arr[i];
                res++;
            }
        }
        return res;
     }  
     public static void main(String[] args) {
        int arr[]={1,2,2,3,3,4,5,5,5,6,7,7,8,9,9,9,9,10};
        int n=arr.length;
        n=removeDuplicateFromSortedArray(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
     } 
}
