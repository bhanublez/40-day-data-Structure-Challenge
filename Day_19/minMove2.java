import java.util.Arrays;
//https://leetcode.com/problems/minimum-moves-to-equal-array-elements-ii/description/
public class minMove2 {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int start=0;
        int count=0;
        int end=nums.length-1;
        while(start<end){
            count+=Math.abs(nums[end]-nums[start]);
            start++;
            end--;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3};
        minMove2 obj=new minMove2();
        System.out.println(obj.minMoves2(nums));
    }
}
