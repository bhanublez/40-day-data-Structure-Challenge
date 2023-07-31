import java.util.Arrays;

public class sortAnArray{

        public int[] sortArray(int[] nums) {
        //Quick Sort Approach
        //sort(nums,0,nums.length-1);

        //Merge Sort
        int n=nums.length;
        //Base case 
        if(n<=1){
            return nums;
        } 
        //Spliting or say dividing array
        int[] left = sortArray(Arrays.copyOfRange(nums, 0, n / 2));
        int[] right =sortArray(Arrays.copyOfRange(nums, n / 2, n));

        return merge(left,right);
         
    }
    private int[] merge(int[] left,int[]  right){
        int n1=left.length;
        int n2=right.length;
        int n=n1+n2,i1=0,i2=0;
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            if(i2==n2){
                arr[i]=left[i1];
                i1++;
            }else if(i1==n1){
                arr[i]=right[i2];
                i2++;
            }else {      
            if(left[i1]<right[i2]){
                arr[i]=left[i1++];
            }else{
                arr[i]=right[i2];
                i2++;
            }
        }
    }
        
          

        return arr;
    }
    // public void sort(int arr[],int low,int high){
    //     if(low>=high){
    //         return;
    //     }
    //         int pi=partition(arr,low,high);
    //         sort(arr,low,pi-1);
    //         sort(arr,pi+1,high);
        
    // }

    // public int partition(int arr[],int low,int high){
    //     int pivot=arr[low];
    //     int i=low+1;
    //     int j=high;
    //     while(i<=j){
    //         while(arr[i]<pivot &&i<high){
    //             i++;
    //         }
    //         while(arr[j]>pivot){
    //             j--;
    //         }
    //         if(i<j){
    //             int temp=arr[i];
    //             arr[i]=arr[j];
    //             arr[j]=temp;
    //             i++;
    //             j--;
    //         }else{
    //             break;
    //         }
    //     }
    //     arr[low]=arr[j];
    //     arr[j]=pivot;

    //     return j;
    // }
        public static void main(String[] args) {
            int[] arr={5,2,3,1};
            sortAnArray obj=new sortAnArray();
            int[] ans=obj.sortArray(arr);
            for(int i=0;i<ans.length;i++){
                System.out.print(ans[i]+" ");
            }
        }
}