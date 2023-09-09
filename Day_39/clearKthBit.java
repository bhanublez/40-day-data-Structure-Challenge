public class clearKthBit {
    static int clearBit(int n, int k)
    {
        return (n & (~(1 << (k - 1))));
    }
    public static void main(String[] args)
    {
        int n = 15, k = 1;
        System.out.println(clearBit(n, k));
    }
}
