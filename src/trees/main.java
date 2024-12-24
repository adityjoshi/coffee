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
            /*
            Binary search tree
             */
        BinarySearchTree x = new BinarySearchTree();
        int [] num = {1,2,3,4,5,6};
        x.populatedSorted(num);
        x.display();
    }
}
