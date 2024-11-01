package LinkedList;

public class doublyLL {
    public static void main(String[] args) {
        dll list = new dll();
        list.insertFirst(2);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(8);
        list.insertFirst(6);
        list.insertLast(99);

        list.display();
    }
}
