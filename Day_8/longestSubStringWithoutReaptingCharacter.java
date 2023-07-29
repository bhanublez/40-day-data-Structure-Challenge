import java.util.HashMap;
import java.util.Map;

public class longestSubStringWithoutReaptingCharacter {
    public int lengthOfLongestSubstring(String s) {
        int head=0;
        int tail=0;
        int n=s.length();
        Map<Character,Integer> map=new HashMap<>();
        int max_l=0; 
        while(tail<n){
            char c=s.charAt(tail++);
            map.put(c,map.getOrDefault(c,0)+1);           
            while(head<=tail && map.get(c)>1){
                map.put(s.charAt(head),map.getOrDefault(s.charAt(head++),0)-1);               
            }
            max_l=Math.max(max_l,tail-head);
        }
    return max_l;
    }
    public static void main(String[] args) {
        longestSubStringWithoutReaptingCharacter l=new longestSubStringWithoutReaptingCharacter();
        System.out.println(l.lengthOfLongestSubstring("abcabcbb"));
    }
}
