public class concetenetionOfArray {

    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int arr[]=new int[2*n];
        for(int i=0;i<n;i++){
            arr[i]=nums[i];
            arr[i+n]=nums[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        concetenetionOfArray obj=new concetenetionOfArray();
        int arr1[]=obj.getConcatenation(arr);
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}