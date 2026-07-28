import java.util.HashSet;

public class MaxStringPair {
    public String reverse(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }
    public int maximumNumberOfStringPairs(String[] arr) {
        HashSet<String> set = new HashSet<>();
        int count = 0;
        for (String ele : arr) {
            String rev = reverse(ele);
            if (set.contains(rev)) {
                count++;
                set.remove(rev);
            } else {
                set.add(ele);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String[] arr = {"cd","ac","dc","ca","zz"};
        MaxStringPair ans = new MaxStringPair();
        int result = ans.maximumNumberOfStringPairs(arr);
        System.out.println(result);
    }
}
