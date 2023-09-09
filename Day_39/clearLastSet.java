public class clearLastSet {
    public static void main(String[] args) {
        int n = 15;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(clearLastSetBit(n));
    }

    private static char[] clearLastSetBit(int n) {
        return Integer.toBinaryString(n & (n - 1)).toCharArray();
    }
}
