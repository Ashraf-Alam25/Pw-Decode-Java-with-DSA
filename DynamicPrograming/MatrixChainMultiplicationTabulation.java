public class MatrixChainMultiplicationTabulation {
    private static  int mcm(int arr[]){
        int n = arr.length;
        int dp[][] = new int[n-1][n-1];
        for(int i = n-2; i >= 0; i--){
            for(int j = 0; j <n-1; j++){
                if(i >= j){
                    dp[i][j] = 0;
                    continue;
                }
                int minCost = Integer.MAX_VALUE;
                for (int k = i; k < j; k++) {
                    int x = arr[i]* arr[k+1]* arr[j+1];
                    int totalCost = dp[i][k] + dp[k+1][j]+x;
                    minCost = Math.min(minCost, totalCost);
                }
                dp[i][j] = minCost;
            }
        }
        return dp[0][n-2];
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        System.out.println(mcm(arr));
    }
}
