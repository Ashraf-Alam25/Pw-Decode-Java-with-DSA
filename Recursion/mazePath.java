package Recursion;

import java.util.Scanner;

public class mazePath {
    public static int maze(int row, int col, int m, int n){
        if(row == m || col == n) return 1;
        int left = maze(row, col+1, m, n);
        int right = maze(row+1, col, m, n);
        return left + right;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter m: ");
        int m = sc.nextInt();
        System.out.print("enter n: ");
        int n = sc.nextInt();
        System.out.println(maze(1,1,m,n));
        sc.close();

    }
}
