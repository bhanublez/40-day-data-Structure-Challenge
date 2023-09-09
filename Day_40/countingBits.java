public class countingBits {
    public int[] countBits(int n) {
        int arr[] = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            arr[i] = rec(i, arr);
        }
        return arr;
    }

    private static int rec(int num, int temp[]) {
        if (num == 0 || num == 1)
            return num;
        if (temp[num] != 0)
            return temp[num];

        if (num % 2 == 0) {
            temp[num] = rec(num / 2, temp);// Assigning in the result array
            return rec(num / 2, temp);// Even condtion
        } else {
            temp[num] = 1 + rec(num / 2, temp);
            return 1 + rec(num / 2, temp);// Odd condtion
        }
    }
}
