import java.util.HashMap;
import java.util.Map;
//https://leetcode.com/problems/integer-to-roman/description/
public class integerToRomain {
    final static int[] val = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    final static String[] rom = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

    public String intToRoman(int N) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; N > 0; i++)
            while (N >= val[i]) {
                ans.append(rom[i]);
                N -= val[i];
            }
        return ans.toString();
    }
    public static void main(String[] args) {
        System.out.println("Integer to Roman");
        int num = 1994;
        System.out.println(new integerToRomain().intToRoman(num));
    }
    
}
