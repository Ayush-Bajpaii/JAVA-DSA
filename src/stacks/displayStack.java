package stacks;

import java.util.Stack;

public class displayStack {
    public static void main(String[] args) {
            Stack<Integer> stack = new Stack<>();
            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.push(4);
            stack.push(5);
            Stack<Integer> rt = new Stack<>();
            while(stack.size()>0){
                rt.push(stack.pop());
            }
            while(rt.size()>0){
                int x = rt.pop();
                System.out.print(x+" ");
                stack.push(x);
            }
        System.out.println(stack);

    }
}
