
import java.util.HashMap;

public class AnagramProblem {
    public static boolean isAnagram(String s, String t){
        if(s.length() != t.length()) return false;
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            if(map.containsKey(key)){
                int freq = map.get(key);
                map.put(key, freq+1);
            }
            else{
                map.put(key, 1);
            }
        }
        HashMap<Character,Integer> tmap = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char key = t.charAt(i);
            if(tmap.containsKey(key)){
                int freq = tmap.get(key);
                tmap.put(key, freq+1);
            }
            else{
                tmap.put(key, 1);
            }
        }
        for (char key : map.keySet()){
            int val1 = map.get(key);
            if(!tmap.containsKey(key)) return false;
            int val2 = tmap.get(key);
            if(val1 != val2) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s,t));
    }
}
