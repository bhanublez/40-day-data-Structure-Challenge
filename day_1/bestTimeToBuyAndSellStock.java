package day_1;

public class bestTimeToBuyAndSellStock{
class Solution {
    public int maxProfit(int[] price) {
        int max=0;
        int min=price[0];
        for(int i=1;i<price.length;i++){
            
            if(max<price[i]-min){
                max=price[i]-min;
            }
            if(min>price[i]){
                min=price[i];
            }

        }
        return max;        
    }
}
public static void main(String[] args) {
    int arr[]={7,1,5,3,6,4};
    System.out.println("Maximum profit is: "+ maxProfit(arr));
}

}