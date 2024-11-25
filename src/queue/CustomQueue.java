package queue;

public class CustomQueue {
    protected int [] data ;
    private static int default_size = 10 ;
    int end = 0 ;

    public CustomQueue() {
        this(default_size);
    }
    public CustomQueue(int size) {
        this.data = new int[size];
    }


    public boolean isFull() {
        // ptr at the last index ;
       return end == data.length;
    }
    public boolean isEmpty() {
        // ptr at -1 ;
        return end == 0;
    }

    public boolean insert(int item) {
        if (isFull()) {
            System.out.println("queue is full");
            return false;
        }
        data[end] = item;
        end++;
        return true ;
    }
}
