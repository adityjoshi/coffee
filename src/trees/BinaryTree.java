package trees;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BinaryTree {
    private static class Node {
        int value;
        Node left;
        Node right;
        public Node(int value) {
             this.value = value;
        }
    }
    private Node root;

    public void populate(Scanner scanner) {
        System.out.println("Enter the root node value");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
    }
    public void populate(Scanner scanner,Node root) {
        System.out.println("Do u want to enter the left " + root.value );
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("Enter the left value " + root.value);
            int value = scanner.nextInt();
             root.left = new Node(value);
             populate(scanner,root.left);
        }
        System.out.println("Do u want to enter the right" + root.value );
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("Enter the right value " + root.value);
            int value = scanner.nextInt();
            root.right = new Node(value);
            populate(scanner,root.right);
        }
    }
   public void display() {
        display(root,"");
   }
   public void display(Node node,String indent) {
        if (node == null) {
            return ;
        }
       System.out.println(indent+node.value);
        display(node.left,indent+ "\t");
        display(node.right , indent + "\t");
   }

    public void prettyDisplay() {
        prettyDisplay(root, 0);
    }

    private void prettyDisplay(Node node, int level) {
        if (node == null) {
            return;
        }

        prettyDisplay(node.right, level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------->" + node.value);
        } else {
            System.out.println(node.value);
        }
        prettyDisplay(node.left, level + 1);
    }

    public void preOrder() {
        preOrder(root);
    }
    private void preOrder(Node node) {
        if(node == null) {
            return;
        }
        System.out.println(node.value);
        preOrder(node.left);
        preOrder(node.right);
    }


}
