package stacks;

import java.util.Stack;

    class MinStack {
    private Stack<Long> stack;
    private long min;

    public MinStack() {
        stack = new Stack<>();
        min = Long.MAX_VALUE;
    }

    public void push(int x) {
        long val = x;
        if (stack.size() == 0) {
            stack.push(val);
            min = val;
        } else if (val >= min) {
            stack.push(val);
        } else {
            stack.push(2 * val - min);
            min = val;
        }
    }

    public void pop() {
        if (stack.size() == 0) {
            return;
        }
        long y = stack.pop();
        if (y < min) {
            min = 2 * min - y;
        }
    }

    public int top() {
        if (stack.size() == 0) {
            throw new IllegalStateException("Stack is empty");
        }
        long y = stack.peek();
        if (y < min) {
            return (int) min;
        }
        return (int) y;
    }

    public int getMin() {
        if (stack.size() == 0) {
            throw new IllegalStateException("Stack is empty");
        }
        return (int) min;
    }

    public static void main(String[] args) {
        MinStack minStack1 = new MinStack();
        System.out.println("Test case 1:");
        minStack1.push(3);
        minStack1.push(5);
        minStack1.push(2);
        minStack1.push(1);
        System.out.println("Min: " + minStack1.getMin());
        minStack1.pop();
        System.out.println("Min after pop: " + minStack1.getMin());
        minStack1.pop();
        System.out.println("Top: " + minStack1.top());
        System.out.println("Min after pop: " + minStack1.getMin());

        MinStack minStack2 = new MinStack();
        System.out.println("\nTest case 2:");
        minStack2.push(1);
        System.out.println("Top: " + minStack2.top());
        System.out.println("Min: " + minStack2.getMin());
        minStack2.pop();

        MinStack minStack3 = new MinStack();
        System.out.println("\nTest case 3:");
        minStack3.push(2);
        minStack3.push(2);
        minStack3.push(2);
        System.out.println("Min: " + minStack3.getMin());
        minStack3.pop();
        System.out.println("Min after pop: " + minStack3.getMin());

        MinStack minStack4 = new MinStack();
        System.out.println("\nTest case 4:");
        minStack4.push(-2);
        minStack4.push(0);
        minStack4.push(-3);
        System.out.println("Min: " + minStack4.getMin());
        minStack4.pop();
        System.out.println("Min after pop: " + minStack4.getMin());

        MinStack minStack5 = new MinStack();
        System.out.println("\nTest case 5:");
        minStack5.push(0);
        minStack5.push(1);
        minStack5.push(0);
        System.out.println("Min: " + minStack5.getMin());
        minStack5.pop();
        System.out.println("Min after pop: " + minStack5.getMin());
    }
}