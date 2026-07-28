
import java.util.HashSet;

public class setIterate {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(-5);
        set.add(40);
        for(int ele: set){
            System.out.print(ele + " ");
        }
        System.out.println();
        
        set.clear();
        System.out.println(set);
    }
}
