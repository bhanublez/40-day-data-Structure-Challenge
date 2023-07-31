import java.util.Stack;
//https://leetcode.com/problems/valid-parentheses/description/
public class validParenthese {
    public boolean isValid(String s) {
        int n=s.length();
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<n;i++){
            char ss=s.charAt(i);
           if((ss=='(')||(ss=='{')||(ss=='[')){
            stack.add(s.charAt(i));
           }
           else if(!stack.isEmpty()){
           if(s.charAt(i)==')' && stack.peek()=='('){
                stack.pop();
            }
            else if(s.charAt(i)==']' && stack.peek()=='['){
                stack.pop();
            }else if(s.charAt(i)=='}' && stack.peek()=='{'){
                stack.pop();
            }else{
                return false;
            }
           }
           else{
               return false;
           }
           }
        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}
