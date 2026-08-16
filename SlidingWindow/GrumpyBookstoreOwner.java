public class GrumpyBookstoreOwner {
     public static  int maxSatisfied(int[] arr, int[] grumpy, int k) {
        int n = arr.length, i = 0, j = k - 1, unsatisfied = 0;
        int a = i, b = j, maxUnsatisfied = 0;
        for(int x = i; x <= j; x++){
            if(grumpy[x] == 1) unsatisfied +=arr[x];

        }
        while(j<n){
            if(maxUnsatisfied < unsatisfied){
                maxUnsatisfied = unsatisfied;
                a = i; b =j;
            }
            i++;j++;
            if(j < n && grumpy[j] == 1) unsatisfied +=arr[j];
            if(grumpy[i-1] == 1) unsatisfied -=arr[i-1];
        }
        for(int x = a; x <= b; x++){
            grumpy[x] = 0;
        }
        int satisfied = 0;
        for(int x = 0; x < n; x++){
            if(grumpy[x] == 0) satisfied +=arr[x];

        }
        return satisfied;
    }
    public static void main(String[] args) {
        int[] arr = {1,0,1,2,1,1,7,5};
        int[] grumpy = {0,1,0,1,0,1,0,1};
        int k = 3;
        int result = maxSatisfied(arr,grumpy,k);
        System.out.println(result);
    }

}
