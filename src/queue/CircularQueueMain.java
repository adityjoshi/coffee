package queue;

public class CircularQueueMain {
    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue(5);
        circularQueue.insert(5);
        circularQueue.insert(4);
        circularQueue.insert(3);
        circularQueue.insert(2);
        circularQueue.insert(1);
       circularQueue.display();
    }
}
