//https://leetcode.com/problems/merge-intervals/description/
import java.util.Arrays;
import java.util.LinkedList;

public class mergeInterval{
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] res = merge(intervals);
        for(int[] i: res){
            System.out.println(i[0] + " " + i[1]);
        }
        System.out.println("Optimal approach");
        int[][] res1 = mergeOptimal(intervals);
        for(int[] i: res1){
            System.out.println(i[0] + " " + i[1]);
        }
    }

    //Brute force approach 
    //Time complexity: O(n^2)
    //Space complexity: O(n)
    public static int[][] merge(int[][] intervals){
        int n = intervals.length;
        int[][] res = new int[n][2];
        int index = 0;
        for(int i = 0; i < n; i++){
            int start = intervals[i][0];
            int end = intervals[i][1];
            for(int j = i+1; j < n; j++){
                if(intervals[j][0] <= end){
                    end = Math.max(end, intervals[j][1]);
                    i++;
                }
            }
            res[index][0] = start;
            res[index][1] = end;
            index++;
        }
        return res;
    }

    //Optimal approach
    //Time complexity: O(nlogn)
    //Space complexity: O(n)
    public static int[][] mergeOptimal(int[][] intervals){
        int n=intervals.length;
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        LinkedList<int[]> merge=new LinkedList<>();
        for(int[] interval:intervals){
            if(merge.isEmpty() || merge.getLast()[1]<interval[0]){
                merge.add(interval);
            }
            else{
                merge.getLast()[1]=Math.max(merge.getLast()[1],interval[1]);
            }
        }
        return merge.toArray(new int[merge.size()][]);
    }
    

}