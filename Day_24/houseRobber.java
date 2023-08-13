public class houseRobber{
     public int rob(int[] nums) {
        int curr=0,//Cuurent amount robed
        last=0,//Previous amount robed
        temp;
        for(int n:nums){
            temp=curr;
//Chose previous one or curr according to max profit
            curr=Math.max(last+n,curr);
            last=temp;
        }
        return curr;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,1};
        houseRobber obj=new houseRobber();
        System.out.println(obj.rob(nums));      
    }
}