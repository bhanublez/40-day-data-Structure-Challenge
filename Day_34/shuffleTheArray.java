public class shuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int arr[]=new int[2*n];
        int k=0;
        for(int i=0,j=n;i<n;i++,j++){
            arr[k]=nums[i];
            arr[k+1]=nums[j];
            k+=2;
        }

        return arr;
    }
    public static void main(String[] args) {
        int nums[]={2,5,1,3,4,7};
        int n=3;
        shuffleTheArray s=new shuffleTheArray();
        int arr[]=s.shuffle(nums,n);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
