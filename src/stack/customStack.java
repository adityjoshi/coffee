package stack;

public class customStack {
    protected int [] data ;
    private static int default_size = 10 ;
    int ptr = -1 ;

    public customStack() {
        this(default_size);
    }
    public customStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) {

        if (isFull()) {
            System.out.println("Stack Overflow");
            return false;
        }
        ptr++;
        data[ptr] = item ;
        return true ;
    }

    int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        }
        int removed = data[ptr];
        ptr--;
        return removed;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        return data[ptr];
    }
    public boolean isFull() {
        // ptr at the last index ;
       return ptr == data.length-1;
    }
    public boolean isEmpty() {
        // ptr at -1 ;
        return ptr == -1;
    }
}
