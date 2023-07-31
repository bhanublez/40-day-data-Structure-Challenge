public class ClimbingStair {
    //Brute force approach
    // public int climbStairs(int n) {
    //     if(n<=2){
    //         return n;
    //     }
    //     return climbStairs(n-1)+climbStairs(n-2);
    // }

    //Optimized
    //Time complexity: O(n)
    //Space complexity: O(1)
    public int climbStairs(int n) {
        if(n<=1){
                return n;
            }
            int a = 1;
            int b = 1;
            int sum = 0;
            for(int i=2;i<=n;i++){
                sum = a+b;
                a = b;
                b = sum;
            }
            return sum;
    }
        
    public static void main(String[] args) {
        ClimbingStair cs = new ClimbingStair();
        int n = 4;
        System.out.println(cs.climbStairs(n));
    }
}
