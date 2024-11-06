package LinkedList;

public class CLL {
    private Node head ;
    private Node tail ;

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int val) {
        Node node = new Node(val);
        // if the ll is empty then make the first node as both head and tail
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        /*\
         when the list is not empty then the tail will point to the new node
         and new node will point to the head i.e. the previous node for circular link
         then the tail will move forward to the new node
         */
        tail.next = node;
        node.next = head ;
        tail = node ;

    }
    public void insertAtCustomPosition(int numAfterWhich,int val) {
      Node node = new Node(val);
      Node afterNode = findNode(numAfterWhich);
      node.next = afterNode.next.next;
      afterNode.next = node;
    }
    public Node findNode(int val) {
        Node node = head ;
        while (node != null) {
            if (node.val == val) {
                return node ;
            }
            node = node.next;
        }
        return null;
    }
    public void display() {
        Node node = head ;
        if (head != null) {
            do {
                System.out.print(node.val + " -> ");
                node = node.next;
            }while (node != head) ;
        }
        System.out.println("head");
    }

    private class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
}
