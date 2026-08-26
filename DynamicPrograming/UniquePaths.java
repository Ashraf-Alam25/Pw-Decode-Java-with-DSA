public class UniquePaths {
    private int findPaths(int r, int c, int m, int n) {
        if (r >= m || c >= n) {
            return 0;
        }
        if (r == m - 1 && c == n - 1) {
            return 1;
        }
        int rightPaths = findPaths(r, c + 1, m, n);
        int downPaths = findPaths(r + 1, c, m, n);
        return rightPaths + downPaths;
    }

    private int uniquePaths(int m, int n) {
        return findPaths(0, 0, m, n);
    }

    public static void main(String[] args) {
        int m = 3, n = 3;
        UniquePaths ob = new UniquePaths();
        System.out.println(ob.uniquePaths(m, n));
    }
}
