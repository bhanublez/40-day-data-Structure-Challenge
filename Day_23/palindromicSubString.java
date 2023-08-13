//https://leetcode.com/problems/palindromic-substrings/description/
public class palindromicSubString {
    int count=0;
    public int countSubstrings(String s) {
        for(int i=0;i<s.length();i++){
            //Here i act as mid point and traversing in both direction take place
            searchPalindrome(s,i,i);
            searchPalindrome(s,i,i+1);
        }
        return count;
    }
    public void searchPalindrome(String s,int left,int right){
        //traverse from both direstion left and right
        while(left>-1 && right<s.length() &&
         s.charAt(left)==s.charAt(right)){
            left--;
            right++;count++;
        }
    }
}
