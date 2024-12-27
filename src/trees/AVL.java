package trees;

public class AVL{
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
    public AVL() {

    }
    public int height() {
        return height(root);
    }
    private int height(Node node) {
        if (node == null) {
            return -1;
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
        return rotate(node) ;
    }

    private Node rotate(Node node) {
        if(height(node.left)-height(node.right)>1) {
            // left heavy
            if(height(node.left.left)-height(node.right) > 1) {
                return rightRotate(node);
            }
            if(height(node.left.left)-height(node.left.right) < 0) {
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }
        if (height(node.left) - height(node.right) < -1) {
            // right heavy
            if(height(node.right.left) - height(node.right.right) < 0) {
                // right-right case
                return leftRotate(node);
            }
            if(height(node.right.left) - height(node.right.right) > 0) {
                // left right case
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node ;
    }
    public Node rightRotate(Node p) {
        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;

        p.height = Math.max(height(p.left), height(p.right) + 1);
        c.height = Math.max(height(c.left), height(c.right) + 1);

        return c;
    }

    public Node leftRotate(Node c) {
        Node p = c.right;
        Node t = p.left;

        p.left = c;
        c.right = t;

        p.height = Math.max(height(p.left), height(p.right) + 1);
        c.height = Math.max(height(c.left), height(c.right) + 1);

        return p;
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

    public void populate(int [] num) {
        for (int i = 0; i<num.length; i++) {
            this.insert(num[i]);
        }
    }

    /*
    when we want to insert a sorted array but in a balanced way
     */
    public void populatedSorted(int [] nums) {
        populatedSorted(nums,0,nums.length);
    }
    private void populatedSorted(int [] nums, int start, int end) {
        if (start>=end) {
            return;
        }
        int mid = start + (end - start)/2;
        this.insert(nums[mid]);
        populatedSorted(nums,start,mid);
        populatedSorted(nums,mid+1,end);
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
