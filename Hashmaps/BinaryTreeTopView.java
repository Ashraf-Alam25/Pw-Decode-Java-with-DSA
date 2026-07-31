import java.util.*;
class Node {
    Node left;
    Node right;
    int data;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
class BinaryTreeTopView {
    public static class Pair{
        Node node;
        int level;
        Pair(Node node, int level){
            this.node = node;
            this.level = level;
        }
    }
	public static void topView(Node root) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Queue<Pair> q = new LinkedList<>();
        Pair r = new Pair(root, 0);
        q.add(r);
        int minLevel = Integer.MAX_VALUE, maxLevel = Integer.MIN_VALUE;
        while(q.size() > 0){
            Pair temp = q.remove();
            Node n= temp.node;
            int lvl = temp.level;
            minLevel = Math.min(minLevel,lvl);
            maxLevel = Math.max(maxLevel,lvl);
            if(!map.containsKey(lvl)) map.put(lvl, n.data);
            if(n.left != null) q.add(new Pair(n.left, lvl-1));
            if(n.right != null) q.add(new Pair(n.right, lvl+1));
        }
        for(int i = minLevel; i<=maxLevel;i++){
            System.out.print(map.get(i)+" ");
        }
    }
	public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        topView(root);
    }	
}