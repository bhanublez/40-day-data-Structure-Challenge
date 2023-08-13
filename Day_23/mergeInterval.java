import java.util.Arrays;
import java.util.LinkedList;
//https://leetcode.com/problems/merge-intervals/description/
public class mergeInterval {
    public int[][] merge(int[][] intervals) {
        //Sorting start value of intervals
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        LinkedList<int[]> merged=new LinkedList<>();
        for(int[] interval:intervals){
            //No overlapping
            if(merged.isEmpty()||merged.getLast()[1]<interval[0]){
                merged.add(interval);
            }else{
                //Overlapping
                merged.getLast()[1]=Math.max(merged.getLast()[1],interval[1]);
            }
        }
         return merged.toArray(new int[merged.size()][]);
    }
    public static void main(String[] args) {
        int arr[][]={{1,3},{2,6},{8,10},{15,18}};
        mergeInterval merge=new mergeInterval();
        int result[][]=merge.merge(arr);
        for(int i=0;i<result.length;i++){
            for(int j=0;j<result[i].length;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}
