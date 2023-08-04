//https://leetcode.com/problems/basic-calculator-ii/

import java.util.Stack;

public class basicCalculatorII {
    public static  int calculate(String s) {
        Stack<Integer> stack=new Stack<>();
        int n=s.length();
        int num=0;
        char sign='+';
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                num=num*10+ch-'0';//to convert char to int
                //num=num*10+Character.getNumericValue(ch);
            }
            if((!Character.isDigit(ch) && ch!=' ') || i==n-1){
                if(sign=='+'){
                    stack.push(num);
                }else if(sign=='-'){
                    stack.push(-num);
                }else if(sign=='*'){
                    stack.push(stack.pop()*num);
                }else if(sign=='/'){
                    stack.push(stack.pop()/num);
                }
                sign=ch;
                num=0;
            }
        }
        int result=0;
        while(!stack.isEmpty()){
            result+=stack.pop();
        }
        return result;
    }
    public static void main(String[] args) {
        String s="3+2*2";
        System.out.println(calculate(s));
    }
}
