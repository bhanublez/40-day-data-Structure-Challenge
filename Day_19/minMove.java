public class minMove {
    public int minMoves(int[] nums) {
        int min=nums[0];
        //Find Minimum value
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<min)
            {
                min=nums[i];
            }
        }
        int result=0;
        for(int i=0;i<nums.length;i++)
        {
            result+=(nums[i]-min);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3};
        minMove obj=new minMove();
        System.out.println(obj.minMoves(nums));
    }
}
