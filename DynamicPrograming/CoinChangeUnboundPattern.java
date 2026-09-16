public class CoinChangeUnboundPattern {
    private long coinCount(int i, int[] coins, int amount,long dp[][]) {
        if(i == coins.length){
            if(amount == 0) return 0;
            return Integer.MAX_VALUE;
        }
        if(dp[i][amount] != -1) return dp[i][amount];
        long skip = coinCount(i+1, coins, amount, dp);
        if(amount - coins[i] < 0) return dp[i][amount] = skip;
        long pick = 1 + coinCount(i, coins, amount - coins[i], dp);
        return dp[i][amount] = Math.min(skip, pick);
        
    }
    public int coinChange(int[] coins, int amount,long[][] dp) {
        int ans = (int)coinCount(0, coins, amount, dp);
        if(ans == Integer.MAX_VALUE) return -1;
        return ans;

    }
    public static void main(String[] args) {
        int []arr = {1,2,5};
        int  amount = 11;
        long dp[][] = new long [arr.length][amount+1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        CoinChangeUnboundPattern ob = new CoinChangeUnboundPattern();
        int ans = ob.coinChange(arr, amount, dp);
        System.out.println(ans);
    }
}
