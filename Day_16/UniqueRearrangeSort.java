import java.util.*;

public class UniqueRearrangeSort {
    
    public static List<Integer> unique_rearrange_sort(List<Integer> lst) {
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();
        
        for (int num : lst) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            } else {
                oddNumbers.add(num);
            }
        }
        
        Collections.sort(evenNumbers);
        Collections.sort(oddNumbers, Collections.reverseOrder());
        
        List<Integer> result = new ArrayList<>();
        int evenIndex = 0;
        int oddIndex = 0;
        
        for (int num : lst) {
            if (num % 2 == 0) {
                result.add(evenNumbers.get(evenIndex));
                evenIndex++;
            } else {
                result.add(oddNumbers.get(oddIndex));
                oddIndex++;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(2, 9, 3, 6, 7, 12, 5);
        List<Integer> output = unique_rearrange_sort(input);
        System.out.println(output); // Output: [9, 2, 7, 6, 5, 12, 3]
    }
}
