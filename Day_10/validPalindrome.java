public class validPalindrome{
    public boolean isPalindrome(String s, int i, int j) {
    while (i <= j) {
        if (s.charAt(i) == s.charAt(j)) {
            i++;
            j--;
        } else {
            return false;
        }
    }
    return true;
}

public boolean validPalindrome(String s) {
    int i = 0;
    int j = s.length() - 1;
    while (i < j) {
        if (s.charAt(i) != s.charAt(j)) {
            return isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1);
        }
        i++;
        j--;
    }
    return true;
}
public static void main(String[] args) {
    validPalindrome vp = new validPalindrome();
    String s = "abca";
    System.out.println(vp.validPalindrome(s));
}
}