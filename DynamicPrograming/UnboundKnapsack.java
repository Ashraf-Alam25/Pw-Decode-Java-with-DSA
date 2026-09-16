public class UnboundKnapsack {
    public int profit(int i, int[] wt, int[] val, int c, int[][]dp){
        if(wt.length == i) return 0;
        if(dp[i][c] != -1) return dp[i][c];
        int skip = profit(i+1, wt, val, c,dp);
        if(wt[i] > c) return dp[i][c] = skip;
        int take = val[i] + profit(i, wt, val, c - wt[i],dp);
        return dp[i][c] = Math.max(skip, take);
    }
    public static void main(String[] args) {
        int[] val = {6,3,9,24};
        int[] wt = {2,2,7,9};
        int c = 9;
        int n = wt.length;
        int dp[][] = new int[n][c+1];
        for (int[] dp1 : dp) {
            for (int j = 0; j < dp[0].length; j++) {
                dp1[j] = -1;
            }
        }
        Knapsack ob = new Knapsack();
        System.out.println(ob.profit(0, wt, val, c, dp));
    }
}
