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
        end = end % data.length ;
        size++;
        return true ;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            throw new Exception("Error =>");
        }
        int removed = data[front];
        front = front % data.length;
        size--;
        return removed;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }
        int i = front;
        do {
            System.out.print(data[i] + " -> ");
            i++;
            i %= data.length;
        } while (i != end);
        System.out.println("END");
    }

}
