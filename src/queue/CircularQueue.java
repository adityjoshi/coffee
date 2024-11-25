package queue;

public class CircularQueue {
    protected int [] data ;
    private static int default_size = 10 ;
   protected int front = 0 ;
    protected  int end = 0 ;
    private int size = 0 ;

    public CircularQueue() {
        this(default_size);
    }
    public CircularQueue(int size) {
        this.data = new int[size];
    }


    public boolean isFull() {
        // ptr at the last index ;
        return size == data.length;
    }
    public boolean isEmpty() {
        // ptr at -1 ;
        return size == 0;
    }

    public boolean insert(int item) {
        if (isFull()) {
            return false ;
        }
        data[end++] = item ;
        end = end % size ;
        size++;
        return true ;
    }
}
