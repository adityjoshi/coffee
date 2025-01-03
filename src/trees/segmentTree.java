package trees;

public class segmentTree {
    public static void main(String[] args) {
        int [] arr = {3,8,6,7,-2,-8,-4,9};
        segmentTree tree = new segmentTree(arr);
        //tree.display();
        System.out.println(tree.query(1,2));
    }
   private static class Node{
       int data;
       int start;
       int end;
       Node left;
       Node right;
       public  Node (int start, int end) {
           this.start = start ;
           this.end  = end ;
    }

    }
    Node root ;

   public segmentTree(int [] arr) {
       // create a tree using array
       this.root = constructTree(arr,0,arr.length-1);
   }

    private Node constructTree(int[] arr, int start, int end) {
       if (start == end ) {
           Node leaf = new Node(start,end);
           leaf.data = arr[start];
           return leaf;
       }
       // create a new node with an index you are at
        Node node = new Node(start,end);
       int mid = (start + end)/2;
       node.left = this.constructTree(arr,start,mid);
       node.right = this.constructTree(arr,mid + 1,end);
       node.data = node.left.data + node.right.data;
       return node;
    }
    public void display() {
        display(this.root);
    }
    private void display(Node node) {
        String str = "";

        if(node.left != null) {
            str = str + "Interval=[" + node.left.start + "-" + node.left.end + "] and data: " + node.left.data + " => ";
        } else {
            str = str + "No left child";
        }

        // for current node
        str = str + "Interval=[" + node.start + "-" + node.end + "] and data: " + node.data + " <= ";

        if(node.right != null) {
            str = str + "Interval=[" + node.right.start + "-" + node.right.end + "] and data: " + node.right.data;
        } else {
            str = str + "No right child";
        }

        System.out.println(str + '\n');

        // call recursion
        if(node.left != null) {
            display(node.left);
        }

        if(node.right != null) {
            display(node.right);
        }
    }
    // query
    public int query(int qsi, int qei) {
        return this.query(this.root, qsi, qei);
    }
    private int query(Node node, int qsi, int qei) {
        if(node.start >= qsi && node.end <= qei) {
            // node is completely lying inside query
            return node.data;
        } else if (node.start > qei || node.end< qsi) {
            // completely outside
            return 0;
        } else {
            return this.query(node.left, qsi, qei) + this.query(node.right, qsi, qei);
        }
    }
}
