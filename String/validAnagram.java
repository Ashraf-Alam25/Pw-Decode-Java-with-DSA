import java.util.Arrays;
import java.util.Scanner;
public class validAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        for(int i = 0; i < a.length; i++){
            if(a[i] != b[i]) return false;
            
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string1 : ");
        String str1 = sc.nextLine();
        System.out.print("Enter your string2 : ");
        String str2 = sc.nextLine();

        validAnagram obj = new validAnagram();

        boolean result = obj.isAnagram(str1, str2);

        if(result){
            System.out.println("Strings are Anagram");
        } else {
            System.out.println("Strings are not Anagram");
        }
        sc.close();
        

    }
}
