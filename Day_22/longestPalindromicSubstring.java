public class longestPalindromicSubstring {
    //Brute force
    //Time Complexity O(n^3)
    public String longestPalindromic(String s){
        int n=s.length();
        String max="";
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                String sub=s.substring(i,j+1);
                if(isPalindrome(sub)){
                    if(sub.length()>max.length()){
                        max=sub;
                    }
                }
            }
        }
        return max;
    }
    private boolean isPalindrome(String sub) {
        int n=sub.length();
        for(int i=0;i<n/2;i++){
            if(sub.charAt(i)!=sub.charAt(i+n-1)){
                return false;
            }
        }
        
        return true;
    }

    //Optimal Solution
    public String longestPalindrome(String s) {
        int n=s.length();
        if(n<2){
            return s;
        }
        int start=0;
        int end=0;
        for(int i=0;i<s.length();i++){
            int part1=searchPalindrome(s,i,i);
            int part2=searchPalindrome(s,i,i+1);
            int max=Math.max(part1,part2);
            if(max>end-start){
                start=i-(max-1)/2;
                end=i+max/2;
            }
        }
        return s.substring(start,end+1);        
    }
    public int searchPalindrome(String s,int left,int right){
        //traverse from both direstion left and right
        while(left>-1 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }


    public static void main(String[] args) {
        String s="babad";
        longestPalindromicSubstring obj=new longestPalindromicSubstring();
        System.out.println(obj.longestPalindromic(s));
    }
}
