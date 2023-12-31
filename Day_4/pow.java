//https://leetcode.com/problems/powx-n/
public class pow {
    public static double myPow(double x, int n) {
        if(n==0){
            return 1;
        }
        if(n==1){
            return x;
        }
        if(n<0){
            return 1/x*myPow(1/x,-(n+1));
        }
        
        if(n%2==0){
            return myPow(x*x,n/2);
        }else{
            return x*myPow(x*x,n/2);
        }
    }
    public static void main(String[] args) {
        System.out.println(myPow(2.00000, 10));
    }
}
