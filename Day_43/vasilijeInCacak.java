import java.util.Scanner;

public class vasilijeInCacak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            long x = sc.nextLong();

            if (k * (k + 1) / 2 > x || (n - k + 1 + n) * k / 2 < x) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }

            t--;
        }
    }
}
