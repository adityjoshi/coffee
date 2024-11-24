package stack;

import java.util.Stack;

public class main {
    public static void main(String[] args) {
        // main for stack programs to call
        System.out.println("stack");
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println(stack);
    }
}
