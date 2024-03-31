import java.util.ArrayList;

public class allSequenceOfString {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        allS(arr, 0, new ArrayList<>());
    }

    public static void allS(int arr[], int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            System.out.println(list);
            return;
        }

        list.add(arr[index]);// List dala
        allS(arr, index + 1, list);

        list.remove(list.size() - 1);// list nekala
        allS(arr, index + 1, list);

    }
}
