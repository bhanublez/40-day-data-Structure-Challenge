public class ratInMazeProblem {

    public void printSolution(int [][]arr,int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }System.out.println();
        }
    }

    public boolean isSafe(int[][] maze,int i,int j,int n){
        if(i>=0 && n>i && j>=0 && j<n && maze[i][j]==1){
            return true;
        }else{
            return false;
        }
    }

    public boolean solveMaze(int [][]maze,int[][] output,int i,int j,int n){
        //Base case
        if(i==n-1 && j==n-1 && maze[i][j]==1){
            output[i][j]=1;
            return true;
        }

        //Recursive calls
        if(isSafe(maze, i, j, n)==true){
            if(output[i][j]==1){
                return false;
            }
            output[i][j]=1;
        }

        //right direction
        if(solveMaze(maze, output, i, j, n)==true){
            return false;
        }

        //backtrack
        output[i][j]=0;
        return false;
    }
}
