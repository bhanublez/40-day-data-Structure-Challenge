
public class bestTimeToBuyAndSellStiock {
    public static void main(String[] args) {
        int arr[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println("The max profit: " + bestPrice(arr));

    }

    public static int bestPrice(int price[]) {
        int max = 0, min = price[0];
        for (int i = 1; i < price.length; i++) {
            if (max < price[i] - min) {
                max = price[i] - min;
            }
            if (min > price[i]) {
                min = price[i];
            }
        }

        return max;
    }
}
