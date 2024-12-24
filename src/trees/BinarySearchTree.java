package trees;

public class BinarySearchTree {
    public class Node {
        private int value;
       private int height;
       private Node left;
       private Node right;

       private Node(int value) {
           this.value = value ;
       }

        public int getValue() {
            return value;
        }
    }
    private Node root;
    public BinarySearchTree() {

    }
    public int height(Node node) {
        if (node == null) {
            return - 1;
        }
        return node.height;
    }
    public boolean isEmpty() {
        return root==null;
    }

    public void insert(int value) {
        root = insert(value ,root );
    }
    private Node insert (int val, Node node) {
        if (node == null) {
            return new Node(val);
        }
        if (val < node.value) {
            node.left = insert(val,node.left);
        }
        if (val > node.value) {
            node.right = insert(val,node.right);
        }
        node.height = Math.max(height(node.left),height(node.right)) + 1 ;
        return node ;
    }


    public boolean Balanced() {
        return Balanced(root);
    }
    private boolean Balanced(Node node) {
        if (root == null) {
            return true ;
        }
        return Math.abs(height(node.left)-height(node.right)) <= 1 && Balanced(node.left) && Balanced(node.right);
    }

    public void populate(int [] nums) {
        for (int i = 0; i<nums.length; i++) {
            this.insert(nums[i]);
        }
    }
    public void display() {
        display(root, "Root Node:");
    }
    private void display(Node node, String details) {
        if (node == null) {
            return;
        }
        System.out.println(details + node.getValue());
        display(node.left, "Left child of " + node.getValue() + " : ");
        display(node.right, "Right child of " + node.getValue() + " : ");
    }
}
