package extra_incorrect_most;
//incorrect fix latter
public class wayToExpressIntegerAsPowerOfSum {

  public int numberOfWays(int n, int x) {
    int mod = (int) 1e9 + 7;
    int[] dp = new int[n + 1];
    dp[0] = 1;
    for (int i = 1; i <= n; i++) {
      for (int j = i; j <= n; j++) {
        if (dp[j - i] != 0) {
          dp[j] = (dp[j] + dp[j - i]) % mod;
        }
      }
    }
    return dp[n];
    }
    
    public static void main(String[] args) {
        int n = 4;
        int x = 1;
        wayToExpressIntegerAsPowerOfSum obj = new wayToExpressIntegerAsPowerOfSum();
        int res = obj.numberOfWays(n, x);
        System.out.println(res);
    }

}
