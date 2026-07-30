
import java.util.HashMap;

public class IterateMap {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("ashraf", 10);
        map.put("tammana", 20);
        map.put("assad", 30);
        map.put("mubarak", 10);
        map.put("ashraf",9);

        for(String key : map.keySet()){
            int val = map.get(key);
            System.out.println(key+" "+val);
        }
        System.out.println();
        for(int val : map.values()){
            System.out.println(val);
        }
        System.out.println();
        for (Object ele : map.entrySet()) {
            System.out.println(ele);
        }
    }
}
