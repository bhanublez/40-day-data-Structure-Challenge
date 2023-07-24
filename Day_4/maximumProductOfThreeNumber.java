public class maximumProductOfThreeNumber {

    //Brute force My
    //Time complexity O(n^3) Space complexity O(1)
    private static int maximumProductOfThreeNumber(int[] arr) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length-2;i++){
            for(int j=i+1;j<arr.length-1;j++){
                for(int k=j+1;k<arr.length;k++){
                    max=Math.max(max,arr[i]*arr[j]*arr[k]);
                }
            }
        }
        
        return max;
    }

    //Optimal approach (Sorting can be use but it will take O(nlogn)
    //Time complexity O(n) Space complexity O(1)
    private static int maximumProductOfThreeNumberOptimal(int[] arr) {
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int max3=Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max1){
                max3=max2;
                max2=max1;
                max1=arr[i];
            }
            else if(arr[i]>max2){
                max3=max2;
                max2=arr[i];
            }
            else if(arr[i]>max3){
                max3=arr[i];
            }
            if(arr[i]<min1){
                min2=min1;
                min1=arr[i];
            }
            else if(arr[i]<min2){
                min2=arr[i];
            }
        }
        return Math.max(max1*max2*max3,max1*min1*min2);
    }


    public static void main(String[] args) {
        int arr[]={-9,1,1,-9,1,1,1,-9};
        System.out.println(maximumProductOfThreeNumber(arr));
        System.out.println(maximumProductOfThreeNumberOptimal(arr));
    }
}
