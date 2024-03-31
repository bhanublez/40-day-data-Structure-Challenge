import java.util.PriorityQueue;

public class furthestBuilding {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        int n=heights.length;
        PriorityQueue<Integer> p=new PriorityQueue<>();
        for(int i=0;i<n-1;i++){
           int diff=heights[i+1]-heights[i];
            if(diff>0){
                p.offer(diff);
            }
            if(p.size()>ladders){
                bricks-=p.poll();
            }
            if(bricks<0){
                return i;
            }
        }
        return n-1;
    }
}
