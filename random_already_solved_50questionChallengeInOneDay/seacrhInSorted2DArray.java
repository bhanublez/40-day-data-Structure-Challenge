public class seacrhInSorted2DArray {
    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        System.out.println("11 is in arr : " + find(arr,11));
    }
    
    public static boolean find(int arr[][], int num) {
        int m = arr.length;
        int n = arr[0].length;
        int low = 0, high = (m * n) - 1;
        int mid = 0;
        while (low <= high) {
            mid = low + (high - low) / 2;
            int middle = arr[mid / n][mid % n];//(matrix[row][col])
            if (middle == num) {
                return true;
            } else if (middle < num) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }

        return false;
    }
    
    
}
