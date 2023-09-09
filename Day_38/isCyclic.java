
//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int V = sc.nextInt();
            int E = sc.nextInt();
            for (int i = 0; i < V; i++)
                list.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
            }
            if (new Solution().isCyclic(V, list) == true)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
// } Driver Code Ends

/* Complete the function below */

class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        boolean[] visited = new boolean[V];// to keep track of visited nodes
        boolean[] recStack = new boolean[V];// to keep track of recursive stack

        for (int i = 0; i < V; i++) {
            if (isCyclicUtil(i, adj, visited, recStack)) {// if cycle is detected, mean graph is cyclic 
                return true;// return true
            }
        }
        return false;

    }

    private boolean isCyclicUtil(int i, ArrayList<ArrayList<Integer>> adj, boolean[] visited, boolean[] recStack) {
        if (recStack[i]) {// if node is already in recursive stack 
            return true;// cycle is detected
        }
        if (visited[i]) {// if node is already visited
            return false;// no cycle
        }
        visited[i] = true;// mark node as visited
        recStack[i] = true;// mark node as visited in recursive stack
        ArrayList<Integer> children = adj.get(i);// get children of node
        for (Integer c : children) {// for each child
            if (isCyclicUtil(c, adj, visited, recStack)) {// if cycle is detected
                return true;// return true
            }
        }
        recStack[i] = false;// mark node as not visited in recursive stack
        return false;
    }
}