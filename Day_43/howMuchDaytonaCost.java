import java.util.Scanner;

public class howMuchDaytonaCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] == k) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("NO");
            } else {
                // int max = 0;
                // for (int i = 0; i < n; i++) {
                // int c = 0;
                // if (arr[i] == k) {
                // c++;
                // for (int j = i + 1; j < n; j++) {
                // if (arr[j] == k) {
                // c++;
                // } else {
                // break;
                // }
                // }
                // }
                // if (c > max) {
                // max = c;
                // }
                // }
                System.out.println("YES");
            }

            t--;
        }
    }
}