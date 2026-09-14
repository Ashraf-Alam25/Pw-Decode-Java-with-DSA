public class KnapsackTab {
    public static void main(String[] args) {
        int [] val = {7,2,4,1};
        int [] w =   {6,1,2,0};
        int c = 7;
        int n = w.length;
        int dp[][] = new int[n][c+1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < c+1; j++) {
                int skip = (i>0) ? dp[i-1][j] : 0;
                if(w[i] > j) dp[i][j] = skip;
                else{
                    int pick = val[i]+ ((i>0) ?dp[i-1][j-w[i]] :0);
                    dp[i][j] = Math.max(pick, skip);
                }
            }
        }
        System.out.println(dp[n-1][c]);
    }
}
