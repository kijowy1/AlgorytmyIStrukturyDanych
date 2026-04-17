import java.util.Collections;
import java.util.List;

public class BinaryTrees {
    private Node root;
    public Integer findMin(){
        return findMinRecursive(this.root);
    }
    public Integer findMax(){
        return findMaxRecursive(this.root);
    }
    public Integer getHeight(){
        return getHeightRecursive(this.root);
    }
    private Integer findMinRecursive(Node current){
        if(current==null) return null;
        if(current.left==null) return current.key;
        return findMinRecursive(current.left);
    }
    private Integer findMaxRecursive(Node current){
        if(current==null) return null;
        if(current.right==null) return current.key;
        return findMaxRecursive(current.right);
    }
    private Integer getHeightRecursive(Node current){
        if(current==null){
            return 0;
        }
        int leftHeight = getHeightRecursive(current.left);
        int rightHeight = getHeightRecursive(current.right);
        return Math.max(leftHeight,rightHeight)+1;
    }
    public void buildTreeAVL(List<Integer> list){
        this.root = buildTreeAVLRecursive(list, 0, list.size()-1);
    }
    private Node buildTreeAVLRecursive(List<Integer> list, int start, int end){
        if(start==0 && end==list.size()-1){
            Collections.sort(list);
        }
        if(start>end){
            return null;
        }
        int mid = (start+end)/2;
        Node node = new Node(list.get(mid));

        node.left = buildTreeAVLRecursive(list,start,mid-1);
        node.right = buildTreeAVLRecursive(list,mid+1,end);
        return node;
    }
    public Node buildTreeBST(List<Integer> list){
        this.root = null;
        for(Integer i:list){
            this.root = insert(this.root,i);
        }
        return this.root;
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
    public void printPreOrder(){
        printPreOrderFunction(this.root);
        System.out.println();
    }
    public void printInOrder(){
        printInOrderFunction(this.root);
        System.out.println();
    }
    public void printPostOrder(){
        printPostOrderFunction(this.root);
        System.out.println();
    }
    public void printInOrderFunction(Node current) {
        if (current == null) {
            return;
        }
        printInOrderFunction(current.left);

        System.out.print(current.key + " ");

        printInOrderFunction(current.right);
    }
    public void printPostOrderFunction(Node current) {
        if (current == null) {
            return;
        }

        printPostOrderFunction(current.left);

        printPostOrderFunction(current.right);

        System.out.print(current.key + " ");
    }
    private void printPreOrderFunction(Node current) {
        if (current == null) {
            return;
        }
        System.out.print(current.key + " ");

        printPreOrderFunction(current.left);

        printPreOrderFunction(current.right);

    }
    public void deleteNode(){
        deleteNodeRecursive(this.root);
    }
    public Node deleteNodeRecursive(Node current) {
        if(current==null){
            return null;
        }
        current.left = deleteNodeRecursive(current.left);

        current.right = deleteNodeRecursive(current.right);

        System.out.print(current.key + " ");

        return null;
    }

}