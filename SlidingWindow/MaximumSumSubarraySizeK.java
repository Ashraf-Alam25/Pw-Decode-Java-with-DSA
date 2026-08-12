public class MaximumSumSubarraySizeK {
    public static void main(String[] args) {
        int[] arr = new int[]{ 10,20,1,3,-40,80,10};
        int k = 2;
        int n = arr.length;
        // int maxSum = 0;
        // for (int i = 0; i <= n - k; i++) {
        //     int sum = 0;
        //     for (int j = i; j <= i+k-1; j++) {
        //         sum += arr[j];
        //     }
        //     maxSum = Math.max(sum, maxSum);
        // }
        // System.out.println(maxSum);

        int maxSum = 0;
        int i = 0, j = k - 1, sum = 0;
        for(int a = 0; a <= k-1; a++){
            sum += arr[a];
        }

        i++; j++;
        while(j < n){
            sum = sum - arr[i-1]+arr[j];
            maxSum = Math.max(sum, maxSum);
            i++;j++;
        }
        System.out.println(maxSum);
    }
}
