
public class isSequence {

    public boolean isSubsequence(String s, String t) {

        int n = t.length();
        int m = s.length();
        if (m < 1)
            return true;
        char word[] = s.toCharArray();
        char sentence[] = t.toCharArray();

        for (int i = 0, j = 0; i < n; i++) {
            if (sentence[i] == word[j]) {
                j++;
            }
            if (j == m)
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        isSequence obj = new isSequence();
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(obj.isSubsequence(s, t));
    }
}