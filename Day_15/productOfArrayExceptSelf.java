public class productOfArrayExceptSelf{

    //Brute Force Method
    //Space Complexity: O(1) less
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int product=1;
        int count=0,index=-1;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
            product*=nums[i];
            }else{
                count++;
                index=i;
            }
        }
        for(int i=0;i<n;i++){
            if(count>1){
                nums[i]=0;
            }else if(count==1){
                if(index!=i){
                  nums[i]=0;  
                }else{
                    nums[i]=product;
                }
            }
            else{
            nums[i]=product/nums[i];
            }
        }
        return nums;
    }

    //Optimized Solution
    public int[] productExceptSelfOptimal(int[] nums) {
    int[] result = new int[nums.length];
     for(int i = 0; i < result.length; i++) {
            result[i] = 1;
        }
    for(int i = 1; i < nums.length; i++) {
            result[i] = nums[i-1] * result[i-1];
        }
        int product = 1;
        for(int i = nums.length - 2; i >= 0; i--){
            product *= nums[i+1];
            result[i] = result[i] * product;
        }

        return result;
    }
    public static void main(String[] args) {
        productOfArrayExceptSelf p=new productOfArrayExceptSelf();
        int[] nums={1,2,3,4};
        int[] result=p.productExceptSelf(nums);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
        //Optimized Solution
        int[] result1=p.productExceptSelfOptimal(nums);
        for(int i=0;i<result1.length;i++){
            System.out.print(result1[i]+" ");
        }
    }
}