package queue;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        /*

         deletion <- 5 <- 4 <- 3 <- 2 <-1 <- Insertion

         */

        queue.add(5);
        queue.add(4);
        queue.add(3);
        queue.add(2);
        queue.add(1);
        System.out.println(queue);
        queue.remove();
        queue.remove();
        System.out.println(queue);

        /*

        a dequeue is a queue that can insert and remove from both the ends

         */


    }
}
