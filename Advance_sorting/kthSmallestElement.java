package Advance_sorting;

public class kthSmallestElement {
    static int ans;
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void print(int arr[]){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static int partition(int arr[], int low, int high){
        int pivot = arr[low]; int pivotIdx = low;
        int smallerCount = 0;
        for(int i = low+1; i <= high; i++){
            if(arr[i] <= pivot) smallerCount++;
        }
        int correctIdx = pivotIdx + smallerCount;
        swap(arr,pivotIdx,correctIdx);

        //partition
        int i = low, j = high;
        while(i < correctIdx && j > correctIdx){
            if(arr[i] <= pivot) i++;
            else if(arr[j] > pivot) j--;
            else if(arr[i] > pivot && arr[j] <= pivot){
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return correctIdx;
    }
    public static void quickSelect(int arr[], int low, int high, int k){
        if(low > high) return;
        int idx = partition(arr, low, high);
        if(idx == k - 1){
            ans = arr[idx];
            return;
        }
        if(k-1 < idx) quickSelect(arr, low, idx - 1, k);
        else quickSelect(arr, idx + 1, high, k);        
    }
    public static void main(String[] args) {
        int arr[] = {4,2,6,3,7,2,5,-9,2,8};
        int n = arr.length;
        print(arr);
        int k = 3;
        ans = -1;
        quickSelect(arr,0,n-1,k);
        System.out.println(ans); 
    }
}
