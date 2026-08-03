import java.util.Collections;
import java.util.PriorityQueue;

public class Basics {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        System.out.println(pq+ " "+pq.peek());
        pq.add(1);
        System.out.println(pq+ " "+pq.peek());
        pq.add(15);
        System.out.println(pq+ " "+pq.peek());
        pq.add(0);
        System.out.println(pq+ " "+pq.peek());
        pq.add(-10);
        System.out.println(pq+ " "+pq.peek());


        PriorityQueue<Integer> maxpq = new PriorityQueue<>(Collections.reverseOrder());
        maxpq.add(4);
        maxpq.add(14);
        maxpq.add(45);
        System.out.println(maxpq+" "+maxpq.peek());
    }
}
