package Recursion;

import java.util.Scanner;

class powLogarithmic {
    public static int pow(int b,int p){
        if(p == 0) return 1;
        int ans = pow(b,p/2);
        if(p%2==0) return ans* ans;
        else return ans*ans*b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int b = sc.nextInt();
        System.out.print("Enter powe : ");
        int p = sc.nextInt();
        System.out.println(pow(b,p));
        sc.close();
    }
}