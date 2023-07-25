//https://leetcode.com/problems/rotate-image/submissions/950680093/
public class rotateImage {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Original Array: ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Rotated Array: ");
        rotate(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }

    private static void rotate(int[][] arr) {
        //Transpose of matrix
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int trmp = arr[i][j];;
                arr[i][j] = arr[j][i];
                arr[j][i] = trmp;
            }
        }

        //Column reverse
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length/2;j++){
                int trmp = arr[i][j];;
                arr[i][j] = arr[i][arr.length-1-j];
                arr[i][arr.length-1-j] = trmp;
            }
        }
    }
}
