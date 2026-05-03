public class checkIfArraySortedOrNot {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,80};
        int n = arr.length;
        boolean flag = true;
        for(int i = 0; i < n - 1; i++){
            if(arr[i] > arr[i+1]){
                flag = false;
                break;
            }
        }
        if(flag == true) System.out.println("sorted array");
        else System.out.println("unsorted array");
    }
}