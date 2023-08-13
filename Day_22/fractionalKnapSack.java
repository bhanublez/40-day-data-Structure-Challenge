import java.util.Arrays;
import java.util.Comparator;

public class fractionalKnapSack {

    public static double getMaxValue(item []arr,int capacity){

        //Sorting of items based on ratio of profit to weight
        Arrays.sort(arr,new Comparator<item>() {
        public int compare(item item1,item item2){
            double cpr1=Double.valueOf(item1.profit/item1.weight);
            double cpr2=Double.valueOf(item2.profit/item2.weight);
            if(cpr1>cpr2){
                return 1;
            }else{
                return -1;
            }
        }    
        });

        //Looping through the items
        double totalvalue=0d;
        for(item i:arr){
            int currwt=(int)i.weight;
            int currProfit=(int)i.profit;
            if(capacity-currwt>=0){
                capacity=capacity-currwt;
                totalvalue+=currProfit;            
        }else{
            double fraction=Double.valueOf(capacity/currwt);
            totalvalue+=currProfit*fraction;
            capacity=(int)(capacity-(currwt*fraction));
            break;
        }
    }
        return totalvalue;
    }

    public static class item{
        int profit;
        int weight;
        item(int profit,int weight){
            this.profit=profit;
            this.weight=weight;
        }
    }
    public static void main(String[] args) {
        int[] profit={10,5,15,7,6,18,3};
        int[] weight={2,3,5,7,1,4,1};
        int capacity=15;
        item[] arr=new item[profit.length];
        for(int i=0;i<profit.length;i++){
            arr[i]=new item(profit[i],weight[i]);
        }
        System.out.println(getMaxValue(arr,capacity));
    }

}
