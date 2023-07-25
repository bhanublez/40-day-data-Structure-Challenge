//https://leetcode.com/problems/set-matrix-zeroes/submissions/
public class setMatrixZero {
    public static void setZeroes(int[][] arr) {
        //Brute force
        //Time complexity: O(n^2)
        //Space complexity: O(n+m)
        int n=arr.length;
        int m=arr[0].length;
        boolean row[]=new boolean[n];
        boolean col[]=new boolean[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==0){
                    row[i]=true;
                    col[j]=true;
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(row[i]||col[j]){
                    arr[i][j]=0;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int arr[][]={{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
