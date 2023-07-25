//https://leetcode.com/problems/search-a-2d-matrix/description/
public class searchA2DMatrix {
    public static void search(int arr[][],int target){
        int m=arr.length;
        int n=arr[0].length;
        int low=0;
        int high=m*n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid/n][mid%n]==target){
                System.out.println("Found at: "+mid/n+" "+mid%n);
                return;
            }else if(arr[mid/n][mid%n]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        System.out.println("Not found");
    }

    public static void main(String[] args) {
        int arr[][]={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        search(arr,3);
        
    }

}
