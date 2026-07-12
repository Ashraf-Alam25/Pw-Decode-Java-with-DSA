package BinarySearch;

public class upperBound {
    public static void main(String[] args) {
        int arr[] = {1,3,5,6,7,8,9,14,45,67};
        int n = arr.length;
        int low = 0, high = n-1;
        int lb = n;
        int target = 4;
        while(low <= high){
            int mid = low +(high - low) /2;
            if(arr[mid] > target){
                lb = Math.min(lb,mid);
                high = mid - 1;
            }
            else low = mid + 1;
        }
        System.out.println(lb);
    }
}
