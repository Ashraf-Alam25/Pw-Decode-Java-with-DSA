package Recursion;

public class subset {
    public static void printSubset(int i, String s, String ans){
        if(i ==s.length()){
            System.out.print(ans+" ");
            return;
        }
        char ch = s.charAt(i);
        printSubset(i+1, s, ans+ch);//take
        printSubset(i+1, s, ans);//not take
    }
    public static void main(String[] args) {
        String s  = "abc";
        printSubset(0,s,"");
    }
}
