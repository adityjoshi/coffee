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
        int [] nums = {5,6,2,1,8,9,12,11};
        x.populate(nums);
        x.display();
    }
}
