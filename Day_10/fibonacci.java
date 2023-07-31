public class fibonacci {
        public int fib(int n) {
            if(n<=1){
                return n;
            }
            return fib(n-1)+fib(n-2);
        }

        //Optimized
        public int fibOptimized(int n) {
            if(n<=1){
                return n;
            }
            int a = 0;
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
            fibonacci f = new fibonacci();
            int n = 4;
            System.out.println(f.fib(n));
        }
}
