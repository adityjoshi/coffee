package trees;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
       /*
       Binary tree
        */
//            Scanner scanner = new Scanner(System.in);
//            BinaryTree tree = new BinaryTree();
//            tree.populate(scanner);
//            tree.prettyDisplay();
//        System.out.println("tree preOrder");
//            tree.preOrder();
//        System.out.println();
//        tree.inOrder();
//        System.out.println();
//        tree.postOrder();
            /*
            Binary search tree
             */
//        BinarySearchTree x = new BinarySearchTree();
//        int [] num = {1,2,3,4,5,6};
//        x.populatedSorted(num);
//        x.display();

        /*
        avl tree
         */
        AVL tree = new AVL();
        for (int i = 0; i < 1000; i++) {
            tree.insert(i);
        }
        System.out.println(tree.height());
    }
}
