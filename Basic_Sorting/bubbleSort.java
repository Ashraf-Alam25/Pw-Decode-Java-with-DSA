public class bubbleSort {
    public static void print(int arr[]){
        for(int ele : arr){
            System.out.print(ele +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {3,1,2,5,-2};
        int n = arr.length;
        print(arr);
        for(int p = 0; p < n - 1; p++){
            boolean flag = true;
            for (int i = 0; i < n - 1 -p; i++) {
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    flag = false;
                }
            }
            if(flag == true) break;
        }
        print(arr);
        
    }
}