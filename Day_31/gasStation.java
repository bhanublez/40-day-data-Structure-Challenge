public class gasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int fuel=0,start=0,sum=0;
        for(int i=0;i<gas.length;i++){
            sum+=gas[i]-cost[i];
            fuel+=gas[i]-cost[i];
            if(fuel<0){
                fuel=0;
                start=i+1;
            }
        }
            if(sum>=0){
                return start%gas.length;
            }
        
        return -1;
    }
    public static void main(String[] args) {
        gasStation g = new gasStation();
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        System.out.println(g.canCompleteCircuit(gas, cost));
    }
}
