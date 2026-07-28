import java.util.HashSet;

public class DistinctIntegers {

    public int reverse(int n){
        int r = 0;
        while(n!=0){
            r = r*10 + n%10;
            n/=10;
        }
        return r;
    }
    public int countDistinctIntegers(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
            set.add(reverse(arr[i]));
        }
        return set.size();
    }

    public static void main(String[] args) {
        int arr[] = {10,12,1,3,60,45,20,10};
        DistinctIntegers ans = new DistinctIntegers();
        int result = ans.countDistinctIntegers(arr);
        System.out.println(result);
    }
}
