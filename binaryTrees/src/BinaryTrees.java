import java.util.Collections;
import java.util.List;

public class BinaryTrees {
    public  Integer findMin(Node root){
        if(root==null) return null;
        if(root.left==null) return root.key;
        return findMin(root.left);
    }public Integer findMax(Node root){
        if(root==null) return null;
        if(root.right==null) return root.key;
        return findMax(root.right);
    }
    public Integer getHeight(Node root){
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
    public void printInOrder(Node root) {
        if (root == null) {
            return;
        }
        printInOrder(root.left);

        System.out.print(root.key + " ");

        printInOrder(root.right);
    }public void printPostOrder(Node root) {
        if (root == null) {
            return;
        }

        printPostOrder(root.left);

        printPostOrder(root.right);

        System.out.print(root.key + " ");
    }
    public void printPreOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.key + " ");

        printPreOrder(root.left);

        printPreOrder(root.right);

    }
    public Node deleteNode(Node root) {
        if(root==null){
            return null;
        }
        root.left = deleteNode(root.left);
        root.right = deleteNode(root.right);
        System.out.print(root.key + " ");
        return null;
    }

}