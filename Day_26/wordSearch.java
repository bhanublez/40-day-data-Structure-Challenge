//https://leetcode.com/problems/word-search/submissions/
public class wordSearch{
    public boolean exist(char[][] board, String word) {
        // boolean result=false;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(search(board,i,j,word,0)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean search(char[][] board, int i, int j, String word, int w){
    if(w == word.length()) return true;
    if(i >= board.length || i <0 || j<0 || j >=board[0].length || board[i][j]!=word.charAt(w))
        return false;
    board[i][j]='#';
    boolean result =    search(board, i-1, j, word, w+1) ||
                     search(board, i, j-1, word, w+1) ||
                     search(board, i, j+1, word, w+1) ||
                     search(board, i+1, j, word, w+1);
    board[i][j] = word.charAt(w);
    return result;
}
    public static void main(String[] args) {
        wordSearch ws = new wordSearch();
        char[][] board = {{'A','B','C','E'},
                          {'S','F','C','S'},
                          {'A','D','E','E'}};
        String word = "ABCCED";
        System.out.println(ws.exist(board, word));
    }
}