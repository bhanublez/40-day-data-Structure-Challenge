public class subArraySumDivisibleByK {
        //brute force approach
        public static int subarraysDivByK(int[] nums, int k) {
            int sum=0;
            int count=0;
            for(int i=0;i<nums.length;i++){
                sum=0;
                for(int j=i;j<nums.length;j++){
                    sum+=nums[j];
                    
                    if(sum%k==0){
                       // System.out.println(sum);
                        count++;
                    }
                }
            }
            return count;
        }

        //Optimal approach
        public static int subarraysDivByK2(int[] nums, int k) {
            int[] rem=new int[k];
            int sum=0;
            int count=0;
            rem[0]=1;
            for(int i=0;i<nums.length;i++){
                sum+=nums[i];
                int r=sum%k;
                if(r<0){
                    r+=k;
                }
                count+=rem[r];
                rem[r]++;
                //System.out.println(sum+" "+r+" "+count);
            }
            return count;
        }

        public static void main(String[] args) {
            int[] nums={4,5,0,-2,-3,1};
            int k=5;
            System.out.println(subarraysDivByK(nums,k));
            System.out.println(subarraysDivByK2(nums,k));
        }
}
