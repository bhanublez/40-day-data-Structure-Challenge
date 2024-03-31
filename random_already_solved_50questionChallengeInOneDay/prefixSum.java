public class prefixSum {

    public static int[][] prefixSum(int arr[][]){
        int n=arr.length;
        int m=arr[0].length;
        int prefix[][]=new int[n][m];
        prefix[0][0]=arr[0][0];
        for(int i=1;i<n;i++){
            prefix[i][0]=prefix[i-1][0]+arr[i][0];
        }
        for(int i=1;i<m;i++){
            prefix[0][i]=prefix[0][i-1]+arr[0][i];
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                prefix[i][j]=prefix[i-1][j]+prefix[i][j-1]-prefix[i-1][j-1]+arr[i][j];
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        int arr[][]={
            {1,1,1,1},
            {1,1,1,1},
            {1,1,1,1},
            {1,1,1,1}
        };
        int prefix[][] = prefixSum(arr);
        for (int i = 0; i < prefix.length; i++) {
            for (int j = 0; j < prefix[0].length; j++) {
                System.out.print(prefix[i][j] + " ");
            }
            System.out.println();
        }
        
        

    }
}
