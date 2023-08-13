import java.util.Arrays;

public class countpalindromicSubSequence {
     public static int countPalindromicSubsequence(String s) {
    int firstOcc[] = new int[26];
    int lastOcc[] = new int[26];
    int result = 0;
    Arrays.fill(firstOcc, Integer.MAX_VALUE);
    // int count=0;
    for (int i = 0; i < s.length(); ++i) {
        firstOcc[s.charAt(i) - 'a'] = Math.min(firstOcc[s.charAt(i) - 'a'], i);
        lastOcc[s.charAt(i) - 'a'] = i;
        // System.out.println(lastOcc[s.charAt(i) - 'a']+" "+count++);
    }
    for (int i = 0; i < 26; ++i){
        // System.out.println(firstOcc[i]+" "+lastOcc[i]);
        if (firstOcc[i] < lastOcc[i])
            result += s.substring(firstOcc[i] + 1, lastOcc[i]).chars().distinct().count();
    }
    return result;
    }
    public static void main(String[] args) {
         String  s = "aabca";
        System.out.println("All sub sequnce possible of 3 length as: "+countPalindromicSubsequence(s));
    }
}
