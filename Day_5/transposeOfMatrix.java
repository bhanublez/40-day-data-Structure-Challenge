//https://leetcode.com/problems/transpose-matrix/
public class transposeOfMatrix {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6}};
        System.out.println("Original Array: ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Transpose Array: ");
        transpose(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
    //time complexity: O(n^2)
    //space complexity: O(n^2)
    private static void transpose(int[][] arr) {
        int result[][]= new int[arr[0].length][arr.length];
        for(int i=0;i<arr[0].length;i++){
            for(int j=0;j<arr.length;j++){
                result[i][j]=arr[j][i];
            }
        }
    }
}
