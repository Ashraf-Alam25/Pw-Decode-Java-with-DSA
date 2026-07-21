package Advance_sorting;
import java.util.*;

public class cyclesort {
    public static void swap(int i, int j, int arr[]){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
    public static void sort(int arr[]){
        int n = arr.length;
        int i = 0;
        while(i < n){
            int correctIdx = arr[i] - 1;
            if(arr[i] != arr[correctIdx]){
                swap(i,correctIdx,arr);
            }
            else i++;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,3,6,2,4,5};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
}
