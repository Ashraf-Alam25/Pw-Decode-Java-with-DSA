package Advance_sorting;

public class MergeTwoSortedArrays {
    public static void print(int arr[]){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void merge(int[] a, int[] b, int c[]){
        int i = 0, j = 0, k = 0;
        while(i < a.length && j < b.length){
            if(a[i] <= b[j]){
                c[k] = a[i];
                k++;
                i++;
            }
            else{
                c[k] = b[j];
                j++;
                k++;
            }
        }
        if(i==a.length){
            while(j < b.length){
                c[k] = b[j];
                j++;
                k++;
            }
        }
        else{
            while(i < a.length){
                c[k] = a[i];
                i++;
                k++;
            }
        }

    }
    public static void main(String[] args) {
        int arr1[] = {10,30,50,60,70,90};
        int arr2[] = {20,30,60,60,70,100};
        int ans[] = new int[arr1.length + arr2.length];
        print(arr1);
        print(arr2);
        merge(arr1,arr2,ans);
        print(ans);
    }
}
