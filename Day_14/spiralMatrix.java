import java.util.ArrayList;
import java.util.List;

public class spiralMatrix{

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result=new ArrayList<>();
        int n=matrix.length;
        int m=matrix[0].length;
        
        int top=0,buttom=n-1,left=0,right=m-1;
       
        while(left<=right && top<=buttom){
            //For top wall
            for(int i=left;i<=right;i++){
                result.add(matrix[top][i]);
            }
            top++;
            //For right wall
            for(int i=top;i<=buttom;i++){
                result.add(matrix[i][right]);
            }
            right--;
            //For buttom wall
            if(top<=buttom){
            for(int i=right;i>=left;i--){
                result.add(matrix[buttom][i]);
            }
            buttom--;
            }
            //For left wall
            if(left<=right){
            for(int i=buttom;i>=top;i--){
                result.add(matrix[i][left]);
            }
            left++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> result=spiralOrder(matrix);
        System.out.println(result); 
    }
}