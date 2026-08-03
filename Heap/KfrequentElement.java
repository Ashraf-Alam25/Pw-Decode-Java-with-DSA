import java.util.HashMap;
import java.util.PriorityQueue;

public class KfrequentElement {
    public static class Pair implements Comparable<Pair>{
        int ele;
        int freq;
        Pair(int ele, int freq){
            this.ele = ele;
            this.freq = freq;
        }
        public int compareTo(Pair p){
            return this.freq -p.freq;
        }
    }
    public static int[] topKFrequent(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int ele : arr) {
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>();
        for(int ele : map.keySet()){
            int freq = map.get(ele);
            pq.add(new Pair(ele,freq));
            if(pq.size() > k) pq.remove();
        }
        int[] ans = new int[k];
        for(int i = 0; i < k; i++){
            Pair p = pq.remove();
            ans[i] = p.ele;
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,1,2,2,3};
        int k = 2;
        int result[] = topKFrequent(arr, k);
        for (int ele : result) {
            System.out.print(ele+" ");
        }
    }
}
