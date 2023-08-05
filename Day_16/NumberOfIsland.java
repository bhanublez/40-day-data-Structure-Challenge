//https://www.geeksforgeeks.org/find-the-number-of-islands-using-dfs/
//https://leetcode.com/problems/number-of-islands/submissions/952899237/
public class NumberOfIsland {
    public int numIslands(char[][] grid) {
        int num= 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid==null || grid.length==0){
                    return 0;
                }
                if(grid[i][j]=='1'){
                num+= dfs(grid, i, j);
                }
            }
        }
        return num;
    }
    
    int dfs(char[][] grid, int i, int j) {
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0') {
            return 0;
        }
        grid[i][j] = '0';
        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);
        return 1;
    }
    public static void main(String[] args) {
        char[][] grid = {{'1','1','1','1','0'},
                         {'1','1','0','1','0'},
                         {'1','1','0','0','0'},
                         {'0','0','0','0','0'}};
        NumberOfIsland obj = new NumberOfIsland();
        System.out.println(obj.numIslands(grid));
    }
}
