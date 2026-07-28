import java.util.HashSet;

public class basicSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(-5);
        set.add(40);
        System.out.println(set);
        System.out.println(set.contains(25));
        System.out.println(set+" "+set.size());
        set.remove(10);
        System.out.println(set+" "+set.size());
        set.remove(1);
        System.out.println(set+" "+set.size());
        Object[] arr = set.toArray();
        for (Object ele : arr) {
            System.out.print(ele + " ");
        }


    }
}
