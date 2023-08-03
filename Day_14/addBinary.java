//https://leetcode.com/problems/add-binary/description/
public class addBinary {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0) {
            int sum  = carry;
            //Here we use a.charAt(i) - '0' to get the int value of the char
            if (i >= 0) {
                sum += a.charAt(i) - '0';
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0';
            }
            sb.append(sum % 2);
            carry = sum / 2;
            i--;
            j--;
        }       
        if (carry != 0){
            sb.append(1);
        } 
        return sb.reverse().toString();
        }
        public static void main(String[] args) {
            String a = "11";
            String b = "1";
            addBinary test = new addBinary();
            String result = test.addBinary(a, b);
            System.out.println(result);
        }
}
