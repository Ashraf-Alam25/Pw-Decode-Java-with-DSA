package Advance_sorting;

public class QuickSortAlgo {
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
    public static void quickSort(int arr[], int low, int high){
        if(low >= high) return;
        //put arr[low] into correct index
        int idx = partition(arr,low,high);
        quickSort(arr,low,idx-1);
        quickSort(arr,idx+1,high);        
    }
    public static void main(String[] args) {
        int arr[] = {4,2,6,3,7,5,9,8};
        int n = arr.length;
        print(arr);
        quickSort(arr,0,n-1);
        print(arr);
    }
}