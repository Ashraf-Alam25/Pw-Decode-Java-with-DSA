import java.util.HashMap;

public class SubArraySumEqualToK {
    public static int subarraySum(int[] arr, int k) {
        int n = arr.length, count = 0;
        for (int i = 1; i < n; i++) {
            arr[i] += arr[i-1];
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if(arr[i] == k) count++;
            int ele = arr[i];
            int rem = ele - k;
            if(map.containsKey(rem)) count += map.get(rem);
            if(map.containsKey(ele)){
                int freq = map.get(ele);
                map.put(ele, freq+1);
            }
            else map.put(ele, 1);
        }
        
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,1};
        int k = 2;
        System.out.println(subarraySum(arr, k));
    }
}
