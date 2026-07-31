
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class L3PalindromicSubSeq {
    public static int countPalindromicSubsequence(String s) {
        HashMap<Character,Integer> firstMap = new HashMap<>();
        HashMap<Character,Integer> lastMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(!firstMap.containsKey(ch)) firstMap.put(ch, i);
            lastMap.put(ch, i);
        }
        int count = 0;
        
        for(char ch : firstMap.keySet()){
            Set<Character> set = new HashSet<>();
            int firstIdx = firstMap.get(ch);
            int lastIdx = lastMap.get(ch);
            for (int i = firstIdx+1; i <= lastIdx-1; i++) {
                set.add(s.charAt(i));
            }
            count += set.size();
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "aabca";
        System.out.println(countPalindromicSubsequence(s));
    }
}
