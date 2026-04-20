import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
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
            while(!Objects.equals(scan.hasNext(),"avl") || !Objects.equals(scan.hasNext(),"bst") ) {
                String tree = scan.next().toLowerCase();
                switch (tree) {
                    case "avl":
                        System.out.print("nodes> ");
                        int nodes = 0;
                        while (true) {
                            try {
                                nodes = scan.nextInt();
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("You need to put a number! ");
                                scan.next();
                                System.out.print("nodes> ");
                            }
                        }
                        int cnt = 0;
                        while(cnt != nodes) {
                            System.out.print("insert> ");
                            try {
                                list.add(scan.nextInt());
                                cnt++;
                            } catch (InputMismatchException e) {
                                System.out.println("You need to put a number! ");
                                scan.next();
                                System.out.print("insert> ");
                            }
                        }
                        System.out.print("action> ");
                        BinaryTrees treeAVL = new BinaryTrees();
                        treeAVL.buildTreeAVL(list);
                        while (scan.hasNext()) {
                            String action = scan.next().toLowerCase();
                            switch (action) {
                                case "help":
                                    System.out.println(help);
                                    break;
                                case "print":
                                    System.out.print("inOrder: ");
                                    treeAVL.printInOrder();
                                    System.out.print("postOrder: ");
                                    treeAVL.printPostOrder();
                                    System.out.print("preOrder: ");
                                    treeAVL.printPreOrder();
                                    break;
                                case "delete":
                                    System.out.print("Deleting Nodes: ");
                                    treeAVL.deleteNode();
                                    System.out.println();
                                    break;
                                case "remove":
                                    System.out.print("Which node to remove?: ");
                                    int number = 0;
                                    try {
                                        number = scan.nextInt();
                                    } catch (InputMismatchException e) {
                                        System.out.println("You need to put a number! ");
                                        scan.next();
                                        System.out.print("Which node to remove?: ");
                                    }
                                    treeAVL.removeNode(number);
                                    System.out.println();
                                    break;
                                case "rebalance":
                                    System.out.println("There's nothing here yet");
                                    break;
                                case "Export":
                                    System.out.println("There's nothing here yet");
                                    break;
                                case "exit":
                                    System.exit(0);
                                    break;
                                default:
                                    System.out.println("There's no such a command as: " + action);
                            }
                            fr.close();
                            System.out.print("action> ");
                        }
                        break;
                    case "bst":
                        System.out.print("nodes> ");
                        nodes = scan.nextInt();
                        System.out.print("insert> ");
                        for (int i = 0; i < nodes; i++) {
                            list.add(scan.nextInt());
                        }
                        System.out.println("action> ");
                        String action = scan.next();
                        break;
                    default:
                        System.out.println("There's no such a tree as: " + tree);
                }
                System.out.print("tree> ");
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
