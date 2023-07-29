public class findingTheIndexOfFirstOcu {
    public int strStr(String haystack, String needle) {
        
        int m = haystack.length();
        int n = needle.length();
        
        for(int i=0; i<m-n+1; i++){
            String str = haystack.substring(i,i+n);
            if(str.equals(needle))
                return i;
        }
        
        return -1;
    }
    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        findingTheIndexOfFirstOcu obj = new findingTheIndexOfFirstOcu();
        System.out.println(obj.strStr(haystack, needle));
    }
}
