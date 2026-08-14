import java.util.HashMap;
public class basics {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("ashraf", 10);
        map.put("tammana", 20);
        map.put("assad", 30);
        System.out.println(map);
        map.put("mubarak", 10);
        map.put("ashraf",9);
        System.out.println(map);

        System.out.println(map.containsKey("ashaf"));
        System.out.println(map.containsValue(0));

        System.out.println(map.size());
        System.out.println(map.remove("tamm"));
        System.out.println(map+" "+map.size());
    }
}
