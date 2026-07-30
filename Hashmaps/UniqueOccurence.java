import java.util.HashMap;
import java.util.HashSet;
public class UniqueOccurence {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : arr){
            if(map.containsKey(ele)){
                int freq = map.get(ele);
                map.put(ele, freq+1);
            }
            else map.put(ele,1); 
        }
        HashSet<Integer> set = new HashSet<>();
        for(int val : map.values()){
            set.add(val);

        }
        return (map.size() == set.size());
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,1,1,3};
        UniqueOccurence ans= new UniqueOccurence();
        System.out.println(ans.uniqueOccurrences(arr));
    }
}
