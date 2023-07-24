public class matrixDiagonalSum {

 //Brute force
 public static int matrixDiagonalSum(int arr[][]){
    int n=arr.length;
    int sum=0;
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(i==j){
                sum+=arr[i][j];
            }
            if(i+j==n-1){
                sum+=arr[i][j];
            }
        }
    }
    if(n%2!=0){
        sum-=arr[n/2][n/2];
    }
    return sum;
 }   

 //Optimized
 public static int matrixDiagonalSumOptimal(int arr[][]){
    int n=arr.length;
    int sum=0;
    for(int i=0;i<n;i++){
        sum+=arr[i][i];
        sum+=arr[i][n-i-1];
    }
    if(n%2!=0){
        sum-=arr[n/2][n/2];
    }
    return sum;
 }
 public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(matrixDiagonalSum(arr));
 }
}
