//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isCycle(V, adj);
            if (ans)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean visited[]=new boolean[V];//This will store the visited nodes
        for(int i=0;i<V;i++){
            if(!visited[i]){//If the node is not visited then call dfs on it
                if(dfs(i,-1,adj,visited)){//If dfs returns true then cycle is found
                    return true;//If cycle is found then return true
                }
            }
        }
        return false;
    }

    private boolean dfs(int i, int j, ArrayList<ArrayList<Integer>> adj, boolean[] visited) {
        visited[i]=true;//Mark the current node as visited  
        for(int k:adj.get(i)){//Iterate through all the adjacent nodes
            if(!visited[k]){//If the adjacent node is not visited then call dfs on it
                if(dfs(k,i,adj,visited)){
                    return true;//If dfs returns true then cycle is found
                }
            }
            else if(k!=j){//If the adjacent node is visited and it is not the parent of the current node then cycle is found, means there is a back edge
                return true;//If cycle is found then return true
            }
        }
        return false;//If cycle is not found then return false
    }
}