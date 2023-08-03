public class powerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if(n==1){
            return true;
        }

        if(n%2!=0 || n==0){
            return false;
        }
        while(n/2!=1){
            if((n/2)%2!=0){
                return false;
            }
            n/=2;
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 16;
        powerOfTwo test = new powerOfTwo();
        boolean result = test.isPowerOfTwo(n);
        System.out.println(result);
    }
}
