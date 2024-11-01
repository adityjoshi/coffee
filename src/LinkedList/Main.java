package LinkedList;

public class Main {
    public static void main(String[] args) {
        // insert element at first
        LL list = new LL();
        list.insertElement(3);
        list.insertElement(8);
        list.insertElement(6);
        list.insertElement(4);
        // custom insert
        list.insertCustom(100,3);
        // insert at last
        list.insertLast(99);

        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.deleteIndex(2));
        list.display();


    }
}
