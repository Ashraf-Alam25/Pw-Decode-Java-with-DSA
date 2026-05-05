public class insertionSort{
    public static void print(int arr[]){
        for(int ele : arr){
            System.out.print(ele +" ");
        }
        System.out.println();
    }
    public static void swap(int arr[],int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int arr[] = {1,4,5,8,1,3,9,1};
        int n = arr.length;
        print(arr);
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j >= 0; j--) {
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }
                else break;
            }
        }
        print(arr);
    }
}