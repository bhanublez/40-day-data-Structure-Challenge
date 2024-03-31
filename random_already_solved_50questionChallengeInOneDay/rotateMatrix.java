import java.util.Arrays;

public class rotateMatrix {

    public static void rotateMatrix(int arr[][]) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i - 1; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[n - 1 - j][i];// 1st row to last column
                arr[n - 1 - j][i] = arr[n - 1 - i][n - 1 - j];// last row to last column
                arr[n - 1 - i][n - 1 - j] = arr[j][n - 1 - i];// last column to 1st column
                arr[j][n - 1 - i] = temp;// 1st column to 1st row
            }
        }
    }

    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        Display(arr);
        rotateMatrix(arr);
        // System.out.println("Transposed: ");

        System.out.println("Rotated Array: ");
        Display(arr);

    }

    public static void Display(int arr[][]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }
    }

}
