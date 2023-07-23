import java.util.Arrays;
// https://leetcode.com/problems/move-zeroes/
public class moveZeroes {
    public static void main(String[] args) {
        int arr[]={0,1,0,3,12};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }

    //My Brute force approach
        public static void moveZeroes(int[] arr) {
            int z=0;
            for(int i=0;i<arr.length;){
                if(arr[i]==0){
                    i++;
                }else if(arr[i]!=0){
                    int temp=arr[i];
                    arr[i]=arr[z];
                    arr[z]=temp;
                    z++;
                    i++;
                }
            }
        }
}
