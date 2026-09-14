public class SubsetSumMemo {
    
    private static boolean  subset(int i, int[] arr, int target, int[][] dp) {
        if(i == arr.length) return target == 0;
        if(dp[i][target] != -1) return (dp[i][target] ==1);
        boolean ans = false;
        boolean skip = subset(i+1, arr, target, dp);
        if(target-arr[i] <0) return ans = skip;
        else{
            boolean pick = subset(i+1, arr, target-arr[i], dp);
            ans = pick || skip;
        }
        dp[i][target] = (ans) ? 1 : 0;
        return  ans;
    }
    public static void main(String[] args) {
        int arr[] = {8,1,3,4}, n = arr.length;
        int target = 8;
        int dp[][] = new int[n][target+1];
        for (int[] dp1 : dp) {
            for (int j = 0; j < dp[0].length; j++) {
                dp1[j] = -1;
            }
        }
        System.out.println(subset(0,arr,target,dp));
    }
}
