package BinarySearch;

public class fistandlastpos {
    public static int[] ans(int arr[], int target){
        int res[] = {-1,-1};
        int n = arr.length;
        // check the element present or not
        int low = 0, high = n-1;
        boolean flag = false;
        while(low <= high){
            int mid = low+(high - low)/2;
            if(arr[mid] == target){
                flag = true;
                break;
            }
            else if(arr[mid] > target) high = mid - 1;
            else if(arr[mid] > target) low = mid + 1;
        }
        if(flag == false) return res;
        
        //lower bound
        low = 0; high = n-1;
        int lb = n;
        while (low <= high) {
            int mid = low +(high - low)/2;
            if(arr[mid] >= target){
                lb = Math.min(mid,lb);
                high = mid - 1;
            }
            else low = mid + 1;
        }
        res[0] = lb;

        //upper bound
        int ub = n;
        low = 0; high = n-1;
        while (low <= high) {
            int mid = low +(high - low)/2;
            if(arr[mid] > target){
                ub = Math.min(mid,ub);
                high = mid - 1;
            }
            else low = mid + 1;
        }
        res[1] = ub - 1;

        return res;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,9,9,9,9,9,9,9,9,11,13,14,25,39,85};
        int target = 9;
        int []result = ans(arr,target);
        for(int ele: result)System.out.print(ele+" ");
    }
}
