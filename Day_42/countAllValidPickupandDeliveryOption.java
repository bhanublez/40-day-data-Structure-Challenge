public class countAllValidPickupandDeliveryOption {
    public static int mod=1000000007;
    public int countOrders(int n) {
        long sum=1;
        for(int i=2;i<=n;i++){
            sum=(sum*(2*i-1)*i)%mod;
        }
        return (int) sum;
    }
}
