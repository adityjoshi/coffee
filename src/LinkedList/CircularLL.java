package LinkedList;

public class CircularLL {
    public static void main(String[] args) {
        CLL list = new CLL();
        list.insert(2);
        list.insert(4);
        list.insert(6);
        list.insert(7);
        list.insert(1);
        list.display();
        System.out.println("Insert At Custom Position");
        list.insertAtCustomPosition(1,5);
        list.display();
        System.out.println("delete");
        list.DeleteCustom(6);
        list.display();
    }
}
