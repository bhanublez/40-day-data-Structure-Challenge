import java.util.*;
public class twoCitySheduling {

    //My Brute force
    public static int twoCitySchedCost(int[][] costs) {

        //Sorting in such to have max profit for visiting city A
        Arrays.sort(costs,(a,b)->{
            return (a[0]-a[1])-(b[0]-b[1]);
        });
        int result=0;
        for(int i=0;i<costs.length/2;i++){
            result+=costs[i][0];
        }

        for(int j=costs.length/2;j<costs.length;j++){
            result+=costs[j][1];
        }
        return result;
    }
    public static void main(String[] args) {
        // int costs[][]={{10,20},{30,200},{400,60},{30,20}};
        // int costs[][]={{250,770},{448,54},{926,667},{184,134},{840,118},{577,469}};
        int costs[][]={{1,0},{0,0},{3,2},{1,2}};
        System.out.println(twoCitySchedCost(costs));
    }
}
