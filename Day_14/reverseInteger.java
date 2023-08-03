public class reverseInteger {
    public int reverse(int x) {
        long result=0;
        while(x!=0){
            int last=x%10;
            result+=last;
            result*=10;
            x/=10;
        }
        result/=10;
        if(result>Integer.MAX_VALUE ||result<Integer.MIN_VALUE){
            return 0;
        }
        if(x<0){
            return (int)(-1*result);
        }
        return (int)result;
    }
    public static void main(String[] args) {
        int x = 123;
        reverseInteger test = new reverseInteger();
        int result = test.reverse(x);
        System.out.println(result);
    }
}
