package stack;

public class dynamicStack extends customStack{
    public dynamicStack() {
        super();
    }
    public dynamicStack(int size) {
        super(size);
    }

    @Override
    public boolean push(int item) {
       if (this.isFull()) {
           int [] temp = new int[data.length * 2];

           // copy all items to this array
           for (int i = 0; i < data.length; i++) {
               temp[i] = data[i];
           }
           data = temp;
       }
       // insert item ;
        return super.push(item);
    }
}
