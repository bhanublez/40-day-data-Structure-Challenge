import java.util.Scanner;

public class aleksaAndStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int value = 1;
            for (int i = 1; i <= n; i++) {
                System.out.print(value + " ");
                value += 2;
            }
            System.out.println();
            t--;
        }
    }
}
