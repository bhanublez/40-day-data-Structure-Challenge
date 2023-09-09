public class singleNumber {
    public int singleNumber(int[] nums) {
        int xor=0;
        for(int n:nums){
            xor=xor^n;
        }
        return xor;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,1,2,3};
        singleNumber obj=new singleNumber();
        System.out.println(obj.singleNumber(arr));
    }
}
