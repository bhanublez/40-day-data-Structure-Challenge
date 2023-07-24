import java.util.Stack;

public class reverseAString{
    public static void main(String[] args){

        //My Brute force method
        String str = "Hello Amit Bhai";
        String reverse = "";
        for(int i = str.length() - 1; i >= 0; i--){
            reverse += str.charAt(i);
        }
        System.out.println(reverse);

        //Using yours Stack approach
        String str2 = "Hello Amit Bhai";
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < str2.length(); i++){
            stack.push(str2.charAt(i));
        }
        String reverse2 = "";
        while(!stack.isEmpty()){
            reverse2 += stack.pop();
        }
        System.out.println(reverse2);
        
        
    }
}