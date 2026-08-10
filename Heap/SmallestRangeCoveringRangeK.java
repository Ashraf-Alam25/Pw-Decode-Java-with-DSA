import java.util.List;
import java.util.PriorityQueue;

class Triplet implements Comparable<Triplet>{
    int ele;
    int row;
    int col;

    public Triplet(int ele, int row, int col) {
        this.ele = ele;
        this.row = row;
        this.col = col;
    }
    public int compareTo(Triplet t){
        return this.ele - t.ele;
    }
}
public class SmallestRangeCoveringRangeK {
    public static  int[] smallestRange(List<List<Integer>> nums) {
        int ans[] = {0,Integer.MAX_VALUE};
        PriorityQueue<Triplet> pq = new PriorityQueue<>();
        int k = nums.size();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < k; i++) {
            int ele = nums.get(i).get(0);
            pq.add(new Triplet(ele, i, 0));
            max = Math.max(ele, max);
        }
        while (true) { 
            Triplet top = pq.remove();
            int ele = top.ele, row = top.row, col = top.col;
            //update minimum range
            if(max - ele < ans[1] - ans[0]){
                ans[0] = ele;
                ans[1] = max;
            }
            if(col == nums.get(row).size()-1) break;
            int next = nums.get(row).get(col+1);
            max = Math.max(max, next);
            pq.add(new Triplet(next, row, col+1));
        }
        return ans;
    }
    public static void main(String[] args) {
        List<List<Integer>> nums = List.of( List.of(4, 7, 9, 12, 15), List.of(0, 8, 10, 14, 20),List.of(6, 12, 16, 30, 50));
        int result[] = smallestRange(nums);
        System.out.println(result[0]+", "+result[1]);
        for (int i : result) {
            System.out.print(i+" ");
        }
    }
}
