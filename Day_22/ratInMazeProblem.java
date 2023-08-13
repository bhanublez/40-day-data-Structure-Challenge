public class ratInMazeProblem {

    public boolean isSafe(int [][]maze, int x, int y, int n){
        if(x>=0 && x<n && y>=0 && y<n && maze[x][y]==1){
            return true;
        }
        return false;
    }
        
    public boolean solveMaze(int [][]maze, int [][]output, int x, int y, int n){
        if(x==n-1 && y==n-1){
            output[x][y]=1;
            return true;
        }
        if(isSafe(maze, x, y, n)){
            output[x][y]=1;
            if(solveMaze(maze, output, x+1, y, n)){
                return true;
            }
            if(solveMaze(maze, output, x, y+1, n)){
                return true;
            }
            output[x][y]=0;
            return false;
        }
        return false;
    }

    public void printSolution(int [][]output, int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(output[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int [][]maze={{1,1,0},{1,1,0},{0,1,1}};
        int n=maze.length;
        int [][]output=new int[n][n];
        ratInMazeProblem obj=new ratInMazeProblem();
        obj.solveMaze(maze, output, 0, 0, n);
        obj.printSolution(output, n);
    }
}
