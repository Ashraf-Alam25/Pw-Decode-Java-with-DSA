package Recursion;

class permutation {
    public static void printPermutations(String ans, String s){
        int n = s.length();
        if(n==0){
            System.out.print(ans+" ");
            return;
        }
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            String left = s.substring(0,i);
            String right =  s.substring(i+1,n);
            printPermutations(ans+ch,left + right);
        }
    }
    public static void main(String[] args) {
        String s = "abc";
        printPermutations("",s);
    }
}
