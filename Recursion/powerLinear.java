package Recursion;

import java.util.Scanner;

public class powerLinear {
    public static int pow(int b,int p){
        if(p == 0) return 1;
        return b*pow(b,p-1);
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
