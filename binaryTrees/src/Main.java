import java.util.*;

public class Main {
    static int height = 0;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
            String tree = scan.next();
            switch (tree) {
                case "AVL":
                    System.out.print("nodes> ");
                    int nodes = scan.nextInt();
                    System.out.print("insert> ");
                    for(int i=0;i<nodes;i++){
                        list.add(scan.nextInt());
                    }
                    break;
                case "BST":
                    System.out.print("nodes> ");
                    nodes = scan.nextInt();
                    System.out.print("insert> ");
                    for(int i=0;i<nodes;i++){
                        list.add(scan.nextInt());
                    }
                    break;
                default:
                    System.out.println("There's no such a tree as: " + tree);
            }

    }
    private static List<Integer> randomListGenerator(int size){
        Random rnd = new Random();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<size;i++){
            list.add(rnd.nextInt(100));
        }
        return list;
    }

}
class Node {
    int key;
    Node left,right;

    public Node(int item){
        key = item;
        left = right = null;
    }
}
class BinaryTree {
    public static Integer findMin(Node root){
        if(root==null) return null;
        if(root.left==null) return root.key;
        return findMin(root.left);
    }public static Integer findMax(Node root){
        if(root==null) return null;
        if(root.right==null) return root.key;
        return findMax(root.right);
    }
    public static Integer getHeight(Node root){
        if (root==null){
            return 0;
        }
         int height = 0;
         int leftHeight = getHeight(root.left);
         int rightHeight = getHeight(root.right);
         return Math.max(leftHeight,rightHeight)+1;
    }
    public static Node buildTreeAVL(List<Integer> list, int start, int end){
        if(start==0 && end==list.size()-1){
            Collections.sort(list);
        }
        if(start>end){
            return null;
        }
        int mid = (start+end)/2;
        Node root = new Node(list.get(mid));

        root.left = buildTreeAVL(list,start,mid-1);
        root.right = buildTreeAVL(list,mid+1,end);

        return root;
    }
    public static Node buildTreeBST(List<Integer> list){
        Node root = null;
        int bstHeight = 0;
        for(Integer i:list){
            root = insert(root,i);
        }
        return root;
    }
    private static Node insert(Node root, int value) {
        if(root==null){
            return new Node(value);
        }
        if (value < root.key) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }
    public static void printInOrder(Node root) {
        if (root == null) {
            return;
        }
        printInOrder(root.left);

        System.out.print(root.key + " ");

        printInOrder(root.right);
    }public static void printPostOrder(Node root) {
        if (root == null) {
            return;
        }

        printPostOrder(root.left);

        printPostOrder(root.right);

        System.out.print(root.key + " ");
    }
    public static void printPreOrder(Node root) {
        if (root == null) {
            return;
        }

        printPreOrder(root.left);

        printPreOrder(root.right);

        System.out.print(root.key + " ");
    }
    public static Node deleteNode(Node root) {
        if(root==null){
            return null;
        }
        root.left = deleteNode(root.left);
        root.right = deleteNode(root.right);
        System.out.print(root.key + " ");
        return null;
    }

}