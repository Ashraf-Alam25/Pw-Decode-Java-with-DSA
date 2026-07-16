package Recursion;

public class stringTraversal {
    public static void print(int i, String s){
        int n = s.length();
        if(i==n) return ;
        System.out.print(s.charAt(i));
        print(i+1, s);
    }
    public static void skip(int i, String s, String ans){
        int n = s.length();
        if(i==n){
            System.out.print(ans);
            return;
        }
        if(s.charAt(i) != 'a') ans += s.charAt(i);
        skip(i+1, s, ans);
    }
    public static void main(String[] args) {
        String s = "Ashraf khan";
        skip(0,s,"");
    }
}
