public class jumbGame {
    public static boolean canJump(int[] nums) {
        int n=nums.length-1;
        //Traversing form back is done
        for(int i=n-1;i>=0;i--){
            if(nums[i]+i>=n){
                n=i;//flaging
            }
        }
        return n==0;//Is it reached at starting postion
    }
    public static void main(String[] args) {
        int nums[] = {2,3,1,1,4};
        System.out.println("Can he reach at it detination: "+canJump(nums));
    }
}
