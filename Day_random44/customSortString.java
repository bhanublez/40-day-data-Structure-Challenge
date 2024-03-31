public class customSortString {
    public String customSortString(String order, String s) {
        char c[]=new char[26];
        for(int i=0;i<s.length();i++){
            c[s.charAt(i)-'a']++;//frequency count
        }
        String ord = "";
        for (int i = 0; i < order.length(); i++) {
            char ch = order.charAt(i);
            if (c[ch - 'a'] > 0) {
                while (c[ch-'a'] > 0) {
                    ord += (char) (ch);
                    c[ch-'a']--;
                }
            }
        }
        
        for (int i = 0; i < 26; i++) {
            while (c[i] > 0) {
                ord += (char) (i + 'a');
                c[i]--;
            }
        }

        return ord;
        }
    
}
