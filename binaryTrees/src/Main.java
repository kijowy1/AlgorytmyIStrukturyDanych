import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        Collections.sort(list);
        Node root = BinaryTree
                .buildTreeBST(list,0, list.size()-1);
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
    Node root;
    public static Node buildTreeBST(List<Integer> list, int start, int end){
        if(start>end){
            return null;
        }
        int mid = (start+end)/2;
        Node node = new Node(list.get(mid));

        node.left = buildTreeBST(list,start,mid-1);
        node.right = buildTreeBST(list,mid+1,end);

        return node;
    }
}