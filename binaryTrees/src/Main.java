import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    static int height = 0;
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        FileReader fr = new FileReader("binaryTrees/actionMenu.txt");
        int x;
        StringBuilder sb = new StringBuilder();
        while ((x = fr.read()) != -1) {
            sb.append((char)x);
        }
        String help = sb.toString();
        fr.close();
        System.out.print("tree> ");
            String tree = scan.next();
            switch (tree) {
                case "AVL":
                    System.out.print("nodes> ");
                    int nodes = 0;
                    while(true) {
                        try {
                            nodes = scan.nextInt();
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("You need to put a number! ");
                            scan.next();
                            System.out.print("nodes> ");
                        }
                    }
                    System.out.print("insert> ");
                    for(int i=0;i<nodes;i++){
                        list.add(scan.nextInt());
                    }
                    System.out.print("action> ");
                    BinaryTrees treeAVL = new BinaryTrees();
                    treeAVL.buildTreeAVL(list);
                    while(scan.hasNext()){
                        String action = scan.next();
                        switch (action) {
                            case "Help":
                                System.out.println(help);
                                break;
                            case "Print":
                                System.out.print("inOrder: "); treeAVL.printInOrder();
                                System.out.print("postOrder: "); treeAVL.printPostOrder();
                                System.out.print("preOrder: "); treeAVL.printPreOrder();
                                break;
                            case "Delete":
                                System.out.print("Deleting Nodes: "); treeAVL.deleteNode();
                                System.out.println();
                                break;
                            case "Exit":
                                System.exit(0);
                                break;
                            default:
                                System.out.println("There's no such a command as: " + action);
                        }
                        fr.close();
                        System.out.print("action> ");
                    }
                    break;
                case "BST":
                    System.out.print("nodes> ");
                    nodes = scan.nextInt();
                    System.out.print("insert> ");
                    for(int i=0;i<nodes;i++){
                        list.add(scan.nextInt());
                    }
                    System.out.println("action> ");
                    String action = scan.next();
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
