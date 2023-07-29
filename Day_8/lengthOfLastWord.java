//https://leetcode.com/problems/length-of-last-word/submissions/
public class lengthOfLastWord {

    //My Brute force approach
    public int lengthOfLastWord(String s) {
        int n=s.length();
        int count=0;
        boolean flag=false;
        for(int i=n-1;i>=0;i--){
            if(flag==false){
                if(s.charAt(i)!=' '){
                    count++;
                    flag=true;
                }
            }else{
            if(s.charAt(i)!=' ' && flag==true){
                count++;
            }else{
                return count;
            }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        lengthOfLastWord llw=new lengthOfLastWord();
        String s="Hello World";
        System.out.println(llw.lengthOfLastWord(s));
    }
}
