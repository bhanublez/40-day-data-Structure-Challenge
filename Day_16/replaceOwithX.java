//https://practice.geeksforgeeks.org/problems/replace-os-with-xs0052/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article
public class replaceOwithX {
    //Here O is surrounded by X then only replace O with X
    //Brute force approach
    //Time complexity: O(n*m)
    //Space complexity: O(n*m)
    public static void replaceOwithX(char[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        char[][] temp = new char[row][col];
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                temp[i][j] = matrix[i][j];
            }
        }
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {

                //traversing all four directions
                if(temp[i][j] == 'O') {
                    if(i-1 >= 0 && temp[i-1][j] == 'X') {
                        matrix[i][j] = 'X';
                    }
                    else if(i+1 < row && temp[i+1][j] == 'X') {
                        matrix[i][j] = 'X';
                    }
                    else if(j-1 >= 0 && temp[i][j-1] == 'X') {
                        matrix[i][j] = 'X';
                    }
                    else if(j+1 < col && temp[i][j+1] == 'X') {
                        matrix[i][j] = 'X';
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        char[][] matrix = {{'X','O','X','O','X','X'},
                           {'X','O','X','X','O','X'},
                           {'X','X','X','O','X','X'},
                           {'O','X','X','X','X','X'},
                           {'X','X','X','O','X','O'},
                           {'O','O','X','O','O','O'}};
        replaceOwithX(matrix);
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[0].length;j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
