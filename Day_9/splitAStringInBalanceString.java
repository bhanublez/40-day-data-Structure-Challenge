//https://leetcode.com/problems/split-a-string-in-balanced-strings/submissions/
public class splitAStringInBalanceString{
    public int balancedStringSplit(String s) {
        int count=0,r=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='R'){
                r++;
            }else{
                r--;
            }
             if(r==0){
            count++;
        }
        }
        return count;       
    }
    public static void main(String[] args) {
        splitAStringInBalanceString obj=new splitAStringInBalanceString();
        System.out.println(obj.balancedStringSplit("RLRRLLRLRL"));
    }
}