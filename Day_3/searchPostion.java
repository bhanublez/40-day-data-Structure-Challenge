//Search target and remove it from the array

import java.util.Arrays;

public class searchPostion {
    public static void main(String[] args) {
        int arr[]={1,3,5,6,2,3,4,8,3};
        int target=3;
        int []ans=removeSearch(arr,target);
        System.out.println(Arrays.toString(ans));
    }
//My Brute force approach
    public static int[] removeSearch(int arr[],int target){
        int z=0;
        for(int i=0;i<arr.length;){
            if(arr[i]==target){
                i++;
            }else if(arr[i]!=target){
                int temp=arr[i];
                arr[i]=arr[z];
                arr[z]=temp;
                z++;
                i++;
            }
        }
        int ans[]=new int[z];
        for(int i=0;i<z;i++){
            ans[i]=arr[i];
        }
        return ans;
    }
}
