package BinarySearch;
public class bs {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,8,9};
        int n = arr.length;
        int target = 2;
        int low = 0, high = n-1;
        boolean flag = false;
        
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == target){
                flag = true;
                break;
            }
            else if(arr[mid] < target) low = mid + 1;
            else if(arr[mid] > target) high = mid - 1;
        }
        if(flag == true)System.out.println("available");
        else System.out.println("not available");
    }
}
