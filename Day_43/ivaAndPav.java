import java.util.*;

public class ivaAndPav {
    static int[] data;

    static void construct(int s, int e, int i, int[] a) {
        if (s == e) {
            data[i] = a[s];
            return;
        }
        int mid = s + (e - s) / 2;
        construct(s, mid, 2 * i + 1, a);
        construct(mid + 1, e, 2 * i + 2, a);
        data[i] = data[2 * i + 1] & data[2 * i + 2];
    }

    static int find(int s, int e, int i, int qs, int qe) {
        if (qs <= s && qe >= e)
            return data[i];
        if (qs > e || qe < s)
            return Integer.MAX_VALUE;
        int mid = s + (e - s) / 2;
        int low = find(s, mid, 2 * i + 1, qs, qe);
        int r = find(mid + 1, e, 2 * i + 2, qs, qe);
        return low & r;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; ++i) {
                a[i] = scanner.nextInt();
            }

            int value = scanner.nextInt();
            data = new int[4 * n];
            construct(0, n - 1, 0, a);

            while (value-- > 0) {
                int tt = scanner.nextInt();
                int k = scanner.nextInt();
                tt--;
                int high = n - 1;
                int low = tt;
                int result = -1;

                while (low <= high) {
                    int mid = low + (high - low) / 2;
                    int pav = find(0, n - 1, 0, tt, mid);
                    if (pav >= k) {
                        low = mid + 1;
                        result = mid;
                    } else {
                        high = mid - 1;
                    }
                }

                if (result >= 0)
                    result += 1;
                System.out.print(result + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
