import java.util.PriorityQueue;

public class kthLargestElement {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] arr = {-3,8,2,4,-7,-8};
        int k = 2;
        for (int ele : arr) {
            pq.add(ele);
            if(pq.size() > k) pq.remove();
        }
        System.out.println(pq.peek());
    }
}
