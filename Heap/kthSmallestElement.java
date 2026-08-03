import java.util.Collections;
import java.util.PriorityQueue;
public class kthSmallestElement {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int[] arr = {-3,8,2,4,-7,-8};
        int k = 3;
        for (int ele : arr) {
            pq.add(ele);
            if(pq.size() > k) pq.remove();
        }
        System.out.println(pq.peek());
    }
}
