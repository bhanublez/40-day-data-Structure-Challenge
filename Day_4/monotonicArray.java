public class monotonicArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(isMonotonic(arr));
    }

    //Use flag instead for reducing time complexity
    private static boolean isMonotonic(int[] arr) {
        boolean isIncreasing=true;
        boolean isDecreasing=true;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                isIncreasing=false;
            }
            if(arr[i]>arr[i-1]){
                isDecreasing=false;
            }
        }
        return isIncreasing || isDecreasing;
    }
}
