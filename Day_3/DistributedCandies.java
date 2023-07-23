import java.util.HashMap;
import java.util.Map;
// https://leetcode.com/problems/distribute-candies/submissions/
public class DistributedCandies {

    //Brute force approach
    public static int distributeCandies(int[] candyType) {
        int n=candyType.length;
        int sum=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(candyType[i])){
                continue;
            }
            else{
                map.put(candyType[i],1);
                sum++;
            }
        }
        if(sum>n/2) return n/2;
        else return sum;
          }    

    //Optimal approach copied leetcode
        public static int distributeCandiesOptimal(int[] candyType) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
    
            for(int candy : candyType) {
                max = Math.max(max, candy);
                min = Math.min(min, candy);
            }
    
            boolean[] seen = new boolean[max - min + 1];
            int n = candyType.length, m = n / 2, count = 0;
    
            for(int i = 0; i < n; i++) {
                if(count == m) return m;
                int type = candyType[i];
                if(seen[type - min]) continue;
                seen[type - min] = true;
                count++;
            }
            
            return count;
        }
    
    public static void main(String[] args) {
        int arr[]={1,1,2,3};
        System.out.println(distributeCandies(arr));   
        System.out.println(distributeCandiesOptimal(arr));   
            
    }        

}
