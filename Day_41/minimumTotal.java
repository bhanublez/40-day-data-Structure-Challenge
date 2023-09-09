import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class minimumTotal {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[] dp = new int[triangle.size() + 1];
        for(int i = triangle.size() - 1; i >= 0; i--){
            List<Integer> cur = triangle.get(i);
            for(int j = 0; j < cur.size(); j++){
                dp[j] = Math.min(dp[j], dp[j + 1]) + cur.get(j);
            }
        }
        return dp[0];
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        minimumTotal test = new minimumTotal();
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(new ArrayList<>(Arrays.asList(2)));
        triangle.add(new ArrayList<>(Arrays.asList(3, 4)));
        triangle.add(new ArrayList<>(Arrays.asList(6, 5, 7)));
        triangle.add(new ArrayList<>(Arrays.asList(4, 1, 8, 3)));
        System.out.println(test.minimumTotal(triangle));
        
    }
}