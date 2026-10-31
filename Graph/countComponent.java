import java.util.LinkedList;
import java.util.Queue;

class countComponent {
    public void bsf(int i, boolean visit[],int[][] isConnected ){
        int n = isConnected.length;
        visit[i] = true;
        Queue<Integer> q =  new LinkedList<>();
        q.add(i);
        while(q.size() > 0){
            int front = q.remove();
            for(int j = 0; j<n; j++){
                if(isConnected[front][j] == 1 && visit[j] == false){
                    q.add(j);
                    visit[j] = true;
                }
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int count = 0;
        boolean visit[] = new boolean[n];
        for(int i = 0; i<n; i++){
            if(!visit[i]){
                bsf(i,visit,isConnected);
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[][] = {{1,1,0},{1,1,0},{0,0,1}};
        countComponent ob = new countComponent();
        int ans = ob.findCircleNum(arr);
        System.out.println(ans);
    }
}