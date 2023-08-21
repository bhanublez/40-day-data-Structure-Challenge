public class numOfTree {
    public int numTrees(int n) {
        int[] result = new int[n+1];
        result[0] = result[1] = 1;
        //Time complexity o(n^2)
        for (int i=2; i<n+1; ++i)
            for(int j=1; j<i+1; ++j)
                result[i] += result[j-1]*result[i-j];
        return result[n];
    }
    public static void main(String[] args) {
        numOfTree n = new numOfTree();
        System.out.println(n.numTrees(3));
    }
}
