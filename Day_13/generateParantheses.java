import java.util.ArrayList;
import java.util.List;

public class generateParantheses {
    public List<String> generateParenthesis(int n) {
        //MyBrute force
        List<String> list=new ArrayList<>();
        parentheses(list,"",n,n);
        return list;
    }
    public void parentheses(List<String> list,String s,int n,int k){
        if(n==0 && k==0){
            list.add(s);
            return;
        }
        if(n>0){
            parentheses(list,s+"(",n-1,k);
        }
        if(k>n){
            parentheses(list,s+")",n,k-1);
        }

    }
    public static void main(String[] args) {
        generateParantheses gp=new generateParantheses();
        System.out.println(gp.generateParenthesis(3));
    }
}
