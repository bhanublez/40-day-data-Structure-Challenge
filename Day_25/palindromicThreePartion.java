public class palindromicThreePartion{
    public static void main(String[] args) {
        String s = "tiitabbacaaacdaad";
        System.out.println(minCut(s));
        
    }
    public static int minCut(String s) {
        int n = s.length();
        int[] dp = new int[n];
        boolean[][] isPal = new boolean[n][n];
        for(int i = 0; i < n; i++){
        	dp[i] = i;
        	for(int j = 0; j <= i; j++){
        		if(s.charAt(i) == s.charAt(j) && (i - j <= 1 || isPal[j + 1][i - 1])){
        			isPal[j][i] = true;
        			dp[i] = j == 0 ? 0 : Math.min(dp[i], dp[j - 1] + 1);
        		}
        	}
        }
        return dp[n - 1];
    }
}