package queue;

public class CustomQueueMain {
    public static void main(String[] args) throws Exception {
        CustomQueue customQueue = new CustomQueue(5);
        customQueue.insert(5);
        customQueue.insert(4);
        customQueue.insert(3);
        customQueue.insert(2);
        customQueue.insert(1);
        customQueue.display();
        customQueue.remove();
        customQueue.display();
    }
}
