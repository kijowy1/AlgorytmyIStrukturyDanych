import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list = listGenerator(15);
        Node root = BinaryTree
                .buildTreeBST(list);
        System.out.println(root.left.right.key);

    }
    private static List<Integer> listGenerator(int size){
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
    public static Node buildTreeAVL(List<Integer> list, int start, int end){
        Collections.sort(list);
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
}