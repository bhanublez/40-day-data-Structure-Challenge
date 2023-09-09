import java.util.HashMap;
import java.util.Map;

public class longestPalindromic {
    public int longestPalindrome(String s) {
        int n = s.length();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int ans=0;
        boolean flag=false;
        for (char c : map.keySet()) {
            int val = map.get(c);
            if (val % 2 == 0) {
                ans += val;
            } else {
                ans += val - 1;
                flag=true;
            }
        }
        if(flag){
            ans+=1;
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
