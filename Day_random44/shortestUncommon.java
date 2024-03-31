// You are given an array arr of size n consisting of non-empty strings.

// Find a string array answer of size n such that:

// answer[i] is the shortest substring of arr[i] that does not occur as a substring in any other string in arr. If multiple such substrings exist, answer[i] should be the lexicographically smallest. And if no such substring exists, answer[i] should be an empty string.
// Return the array answer.
import java.util.regex.Pattern;
public class shortestUncommon {
    public String[] shortestSubstrings(String[] arr) {
        int n = arr.length;
        String[] ans = new String[n];
        for (int i = 0; i < n; i++) {
            String s =null;
            for (int j = 0; j < arr[i].length(); j++) {
                inner: for (int k = j + 1; k <= arr[i].length(); k++) {
                    String sub = arr[i].substring(j, k);
                    for (int l = 0; l < n; l++) {
                        if (l == i) {
                            continue;
                        }
                        if (arr[l].contains(sub)) {
                            continue inner;
                        }
                    }
                    if (s == null || sub.length() < s.length()
                            || (sub.length() == s.length() && sub.compareTo(s) < 0)) {
                        s = sub;
                    }
                }
            }
            if(s==null)
                ans[i]="";
            else
                ans[i]=s;
        }
        return ans;
    }
}