import java.util.Arrays;
import java.util.Scanner;

class RussianDollEnvelopes {
    static class Envelope implements Comparable<Envelope>{
        int w;
        int h;
        Envelope(int w, int h){
            this.w = w;
            this.h = h;
        }
        @Override
        public int compareTo(Envelope e){
            if(this.w == e.w) return e.h - this.h;
            else return this.w - e.w;
        }
    }
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = sc.nextInt();
        Envelope [] arr = new Envelope[n];
        for(int i = 0; i < n; i++){
            System.out.print("w: ");
            int w = sc.nextInt();
            System.out.print("enter h: ");
            int h = sc.nextInt();
            arr[i] = new Envelope(w, h);
        }
        Arrays.sort(arr);
        int dp[] = new int[n];
        int max = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                if(arr[j].h < arr[i].h){
                    dp[i] = Math.max(dp[i], dp[j]);
                }
            }
            dp[i] += 1;
            max = Math.max(max, dp[i]);
        }
        System.out.println("toatal ans : " + max);
	}
}