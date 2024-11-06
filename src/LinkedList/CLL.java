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
    public void display() {
        Node node = head ;
        if ()
    }

    private class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
}
