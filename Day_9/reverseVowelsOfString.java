//https://leetcode.com/problems/reverse-vowels-of-a-string/submissions/
public class reverseVowelsOfString {
    public String reverseVowels(String s) {
        char[] c = s.toCharArray();
        for (int i = 0, j = s.length() - 1; i <= j - 1; i++, j--) {
            while (i < j && !isVowel(c[i])) {
                i++;
            }
            while (i < j && !isVowel(c[j])) {
                j--;
            }
            if (i < j) {
                char temp = c[i];
                c[i] = c[j];
                c[j] = temp;
            }
        }
        return new String(c);
    }
    
    public boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    public static void main(String[] args) {
        reverseVowelsOfString obj=new reverseVowelsOfString();
        System.out.println(obj.reverseVowels("leetcode"));
    }
}
