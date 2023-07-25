//https://leetcode.com/problems/flipping-an-image/submissions/
public class flippingAnImage {
    public int[][] flipAndInvertImage(int[][] arr) {
        //Brute force
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length/2;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[i][n-j-1];
                arr[i][n-1-j]=temp;

            }
        }

        //Inversion
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i][j]==1){
                    arr[i][j]=0;
                }else{
                    arr[i][j]=1;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[][]={{1,1,0},{1,0,1},{0,0,0}};
        flippingAnImage f=new flippingAnImage();
        f.flipAndInvertImage(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
