public class SubsetSum {
    private static boolean subset(int i, int sum, int[] arr, int target) {
        if(i == arr.length){
            return sum == target;
        }
        boolean pick = subset(i+1, arr[i]+sum, arr, target);
        boolean skip = subset(i+1, sum, arr, target);
        return pick || skip;
    }
    public static void main(String[] args) {
        int arr[] = {8,0,2,4};
        int target = 9;
        System.out.println(subset(0, 0, arr, target));
    }
}
