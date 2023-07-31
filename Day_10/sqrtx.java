public class sqrtx {
    public int mySqrt(int x) {
        //Direct Approach
        //return (int)Math.sqrt(x);

        //Binary appraoch
        //Iterative approach
        if(x==1 || x==0){
            return x;
        }
        int mid=0;
        int low=2,high=(int)(x/2);
        while(low<=high){
             mid=low+(high-low)/2;
             long num=(long)mid*mid;
            if(num==x){
                return mid;
            }else if(num>x){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return high;
    }
    public static void main(String[] args) {
        sqrtx sx = new sqrtx();
        int x = 8;
        System.out.println(sx.mySqrt(x));
    }
}
