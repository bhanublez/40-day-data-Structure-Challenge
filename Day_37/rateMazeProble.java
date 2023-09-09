//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}

// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
        ArrayList<String> result=new ArrayList<>();//This will store all the possible paths
        boolean visited[][]=new boolean[n][n];//This will store the visited nodes
        if(m[0][0]==0){
            return result;//In this case rat can't move
        }
        dfs(0,0,m,n,"",visited,result);//This will find all the possible paths
        return result;
    }

    private static void dfs(int i, int j, int[][] m, int n, String string, boolean[][] visited,
            ArrayList<String> result) {
        if(i<0 || j<0 || i>=n || j>=n || m[i][j]==0 || visited[i][j]){
            return;//If rat is out of the matrix or it is on 0 or it is already visited then return, means this path is not possible
        }
        if(i==n-1 && j==n-1){
            result.add(string);
            return;//If rat is at the destination, then add the path to the result and return
        }
        visited[i][j]=true;//Mark the current node as visited
        dfs(i+1,j,m,n,string+"D",visited,result);//Move down
        dfs(i,j-1,m,n,string+"L",visited,result);//Move left
        dfs(i,j+1,m,n,string+"R",visited,result);//Move right
        dfs(i-1,j,m,n,string+"U",visited,result);//Move up
        visited[i][j]=false;//Mark the current node as unvisited
    }
}
