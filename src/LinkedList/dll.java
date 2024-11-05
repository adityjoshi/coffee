package LinkedList;

public class dll {

    private Node head;

    // insert at first of the linked list
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;

    }
    // insert at the last of the linked list
    public void insertLast(int val) {
        Node node = new Node(val);
        Node last = head ;
        // next value of last node will be null
        node.next = null ;
        // check if the head is null or not
        if (head == null) {
            node.prev = null;
            head = node ;
            return ;
        }
        // move the last until we stumble upon the end of the ll
        while (last.next != null) {
            last = last.next;
        }
        last.next = node ;
        node.prev = last ;
    }

    // insert at custom position
    /*
     2 -> 3 -> 4 -> 8 -> null
                6
     2 -> 3 -> 4 -> 6 -> 8 -> null

     */
    public void insertCustom(int insertAfterTheNumber, int val) {
         Node p = findValue(insertAfterTheNumber);
         Node node = new Node(val);
         node.next = p.next;
         node.prev = p;
         p.next = node ;
    }


    public Node findValue(int afterVal) {
        Node node = head;
        while (node != null) {
            if (node.val == afterVal) {
                return node;
            }
            node = node.next;
        }
        return null;
    }
    public void display() {
        Node node = head;
         Node last = null ;
        while (node != null) {
            System.out.print(node.val + "->");
            last = node ;
            node = node.next;
        }
        System.out.println("End");

        while (last != null) {
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.println("start");
    }

    private class Node {
        int val;
        Node next;
        Node prev;

        public Node (int val) {
            this.val = val;
        }
        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
