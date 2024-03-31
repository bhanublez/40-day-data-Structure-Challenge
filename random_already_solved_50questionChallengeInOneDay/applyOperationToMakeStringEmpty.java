import java.util.HashMap;

// You are given a string s.

// Consider performing the following operation until s becomes empty:

// For every alphabet character from'a'to'z',remove the first occurrence of that character in s(if it exists).Return the value of the string s right before applying the last operation.

public class applyOperationToMakeStringEmpty {
    public static void main(String[] args) {
        String s = "abcdeeeffgghhiiijjkkllmmnnooppqqrrssttuuvvwwxxyyzz";
        System.out.println("Kuch " + lastNonEmptyString(s));
        System.out.println("Optimized " + lastNonEmptyStringOptimized(s));
    }

    // My Brute for but time limit exeeds
    public static String lastNonEmptyString(String s) {
        int[] arr = new int[26];
        String res = s;

        for (int i = 0; i < 26; i++) {
            arr[i] = 1;
        }

        StringBuilder sb = new StringBuilder();
        while (!s.isEmpty()) {
            sb.setLength(0);

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (arr[ch - 'a'] == 1) {
                    arr[ch - 'a'] = 0;
                } else {
                    sb.append(ch);
                }
            }
            s = sb.toString();
            if (!s.isEmpty()) {

                // System.out.println("S: " + s);
                res = s;
            }

            for (int i = 0; i < 26; i++) {
                arr[i] = 1;
            }
        }
        return res;
    }

    // Optimized
    public static String lastNonEmptyStringOptimized(String s) {
        int countF[] = new int[26];
        int max=Integer.MIN_VALUE;
        for (char i : s.toCharArray()) {
            countF[i - 'a']++;
            max=Math.max(max, countF[i - 'a']);
        }

        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (countF[c - 'a'] == max) {
                countF[c - 'a'] = -1;
                result = c + result;
            }
        }
        return result;
    }
}
