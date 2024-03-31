public class tileProblem {

    public static int cal(int n) {
        if (n == 1 || n == 2 || n == 3) {
            return n;
        }
        return cal(n - 1) + cal(n - 2);
    }

    public static void main(String[] args) {
        System.out.print("Total Ways: " + cal(5));
        ;
    }
}
